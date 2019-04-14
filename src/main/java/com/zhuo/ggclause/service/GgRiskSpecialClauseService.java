package com.zhuo.ggclause.service;



import com.zhuo.ggclause.common.AppConstants;
import com.zhuo.ggclause.dao.GgCompanyDao;
import com.zhuo.ggclause.dao.GgRiskSpecialClauseDao;


import com.zhuo.ggclause.dao.GgRunCheckPointDao;
import com.zhuo.ggclause.dto.GgCheckpointDto;
import com.zhuo.ggclause.dto.GgCompanyDto;
import com.zhuo.ggclause.dto.GgRiskSpecialClauseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  9:26
 * @description
 */
@Service
public class GgRiskSpecialClauseService {
    @Autowired
    private GgRiskSpecialClauseDao ggRiskSpecialClauseDao;
    @Autowired
    private GgCompanyDao ggCompanyDao;

    @Autowired
    private GgRunCheckPointDao ggRunCheckPointDao;

    public StringBuffer[] processAutoClauseForCar(String businessType, String businessNo, Long businessSeqNo, String companyCode, String riskCode, String clauseSysCode) {
        StringBuffer[] returnSBuffer = new StringBuffer[3];
        StringBuffer autoClauseForDelate = new StringBuffer();        //用于SQL删除
        StringBuffer autoFormatClauseCode = new StringBuffer();        //用于自动生成特别约定的格式化代码
        StringBuffer autoClauseCode = new StringBuffer();

        boolean blWhile = true;
        boolean checkFlag = true;
        boolean getMapFlag = true;
        Map checkSqlMap = null;
        GgCompanyDto ggCompanyDto = new GgCompanyDto();

        GgRiskSpecialClauseDto ggRiskSpecialClauseDto = new GgRiskSpecialClauseDto();
        ggRiskSpecialClauseDto.setRiskCode(riskCode);
        ggRiskSpecialClauseDto.setCompanyCode(companyCode);
        ggRiskSpecialClauseDto.setModifyInd("4");
        ggRiskSpecialClauseDto.setValidInd("1");
        if ("01".equals(clauseSysCode)) {
            ggRiskSpecialClauseDto.setVehicleClauseSysFlag("1");
        }

        while (blWhile) {

            List autoClauseList = ggRiskSpecialClauseDao
                    .findAllByRiskCodeAndCompanyCodeAndModifyIndAndValidInd(riskCode, companyCode, "4", "1"); //得到6个 ggRiskSpecialClauseDto

            if (autoClauseList != null && autoClauseList.size() > 0) {  //size是6个
                if (getMapFlag) {
                    //这个方法就是拿到checkClauseConfig.xml的东西
                    checkSqlMap = this.getCheckSql(businessType, businessNo, businessSeqNo, riskCode); //size=29


                    getMapFlag = false;
                }

                for (int i = 0; i < autoClauseList.size(); i++) {
                    checkFlag = true;
                    GgRiskSpecialClauseDto ggRiskSpecialClauseDtoTemp = (GgRiskSpecialClauseDto) autoClauseList.get(i);

                    if (checkSqlMap.containsKey(ggRiskSpecialClauseDtoTemp.getClauseCode())) {
                        GgCheckpointDto ggCheckpointDto = (GgCheckpointDto) checkSqlMap.get(ggRiskSpecialClauseDtoTemp.getClauseCode());

                        if ("0".equals(ggRunCheckPointDao.runCheckpoint(ggCheckpointDto))) {
                            checkFlag = false;
                        }
                    }
                    autoClauseForDelate.append("'").append(ggRiskSpecialClauseDtoTemp.getClauseCode()).append("',");
                    if (checkFlag) {
                        autoFormatClauseCode.append(riskCode).append(ggRiskSpecialClauseDtoTemp.getClauseCode()).append("2").append(",");
                        autoClauseCode.append(ggRiskSpecialClauseDtoTemp.getClauseCode()).append(",");
                    }
                }

            }


            ggCompanyDto = ggCompanyDao.getOne(companyCode);

            if (ggCompanyDto != null) {
                if (ggCompanyDto.getUpperCompanyCode().equals(companyCode)) {
                    blWhile = false;
                }
                if (blWhile) {
                    companyCode = ggCompanyDto.getUpperCompanyCode();
                    ggRiskSpecialClauseDto.setCompanyCode(companyCode);
                }
            } else {
                blWhile = false;
            }

        }

        if (autoClauseForDelate.length() > 0) {
            autoClauseForDelate.deleteCharAt(autoClauseForDelate.length() - 1);
        }

        returnSBuffer[0] = autoClauseForDelate;
        returnSBuffer[1] = autoFormatClauseCode;
        returnSBuffer[2] = autoClauseCode;

        return returnSBuffer;
    }

    private Map getCheckSql(String bussinessType, String businessNo, Long businessSeqNo, String riskCode) {
        Map checkClauseConfigMap = AppConstants.CheckClauseConfigMap; //解析了xml  得到{"proposal":(ggCheckPointDto)list1,"endor":(ggCheckPointDto)list2}
        List checkpointList = (List) checkClauseConfigMap.get(bussinessType.toLowerCase());
        Map checkSqlMap = new HashMap();
        Map argumentMap = new HashMap();

        argumentMap.put("argument", businessNo);
        argumentMap.put("argumentSeqNo", businessSeqNo);
        argumentMap.put("argumentRiskCode", riskCode);
        GgCheckpointDto ggCheckpointDto = null;

        if (checkpointList != null && checkpointList.size() > 0) {
            for (int i = 0; i < checkpointList.size(); i++) {
                ggCheckpointDto = (GgCheckpointDto) checkpointList.get(i);
                ggCheckpointDto.setArgumentMap(argumentMap);
                checkSqlMap.put(ggCheckpointDto.getDescription(), ggCheckpointDto);
            }
        }

        return checkSqlMap;
    }
}
