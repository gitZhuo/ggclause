package com.zhuo.ggclause.clause;

import com.zhuo.ggclause.dto.GgClauseDto;
import com.zhuo.ggclause.dto.GuProposalRiskDto;
import com.zhuo.ggclause.service.GgRiskSpecialClauseService;
import com.zhuo.ggclause.service.GuCommonService;
import com.zhuo.ggclause.service.GuProductRiskClauseService;
import com.zhuo.ggclause.util.CommonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jnlp.ServiceManager;
import java.util.*;

/**
 * @author zhuoshengqi
 * @date 2019/03/12  18:27
 * @description
 */
@RestController
@RequestMapping("/clause")
public class ClauseInfo {
    @Autowired
    private GuCommonService guCommonService;

    @Autowired
    private GuProductRiskClauseService guProductRiskClauseService;

    @Autowired
    private GgRiskSpecialClauseService ggRiskSpecialClauseService;



    @RequestMapping("/makeCluauseInfo")
    public Map makeClauseInfo(@RequestBody Map paramMap) throws Exception {

        //String businessType = CommonUtils.getParameter(paramMap, "businessType");
        String businessType = (String) paramMap.get("businessType");
        String riskCode = "";
        String planCode = "";
        //String companyCode = CommonUtils.getParameter(paramMap, "handlerCompany");
        String companyCode = (String) paramMap.get("handlerCompany");
        StringBuffer clauseCode = new StringBuffer();
        StringBuffer clauseCodeTemp = new StringBuffer();
        StringBuffer clauseCodeForDelate = new StringBuffer();
        String businessNo = null;
        Long businessSeqNo = null;
        boolean mainClause = true;
        boolean mainSubClause = true;
        //riskCode = CommonUtils.getParameter(paramMap,"productRiskCode");
        riskCode = (String) paramMap.get("productRiskCode");

        if ("Endor".equals(businessType)) {
            businessNo = CommonUtils.getParameter(paramMap,"endorNo");
        } else if ("Renewal".equals(businessType)) {
            businessNo = CommonUtils.getParameter(paramMap,"renewalNo");
            businessSeqNo = CommonUtils.getLongParameter(paramMap, "renewalSeqNo", null);
        }else if ("Proposal".equals(businessType)){
            businessNo = CommonUtils.getParameter(paramMap,"proposalNo");
            GuProposalRiskDto guProposalRiskDto = (GuProposalRiskDto)paramMap.get("guProposalRiskDto");
        }

        //String clauseSysCode = guCommonService.getBusinessRiskClauseSysType(businessType, businessNo, riskCode);
        String clauseSysCode = "";

        StringBuffer[] autoClauseArray = ggRiskSpecialClauseService.
                processAutoClauseForCar(businessType, businessNo, businessSeqNo, companyCode, riskCode, clauseSysCode);
        clauseCodeForDelate = autoClauseArray[0];
        clauseCode = autoClauseArray[1];
        clauseCodeTemp = autoClauseArray[2];

        StringBuffer makeClauseCodes = new StringBuffer(clauseCodeTemp.toString());

        paramMap.put("autoClauseCodes", clauseCodeForDelate);
        paramMap.put("makeClauseCodes", makeClauseCodes);


        HashMap riskSpecialMap = null;
        StringBuilder executClause = new StringBuilder();
        if(paramMap.get("riskSpecialMap") != null){	//页面上的特约
            riskSpecialMap = (HashMap)paramMap.get("riskSpecialMap");
            Iterator iter = riskSpecialMap.keySet().iterator();
            while (iter.hasNext()) {
                String key = (String) iter.next();
//	 				if(clauseCodeForDelate.indexOf(key) < 0){
//	 					clauseCodeTemp.append(key).append(",");
//	 					clauseCode.append(riskCode).append(key).append("2").append(",");
//	 				}

                if("Endor".equals(businessType)){
                    key = key.replaceFirst(riskCode, "");
                    if(clauseCodeTemp.indexOf(key + ",") < 0){
                        clauseCodeTemp.append(key).append(",");
                        clauseCode.append(riskCode).append(key).append("2").append(",");
                    }
                }else{
                    if(clauseCodeForDelate.indexOf("'" + key + "'") < 0){
                        clauseCodeTemp.append(key).append(",");
                        clauseCode.append(riskCode).append(key).append("2").append(",");
                    }
                }
            }
        }
        // 上海机构 交强险特别约定：如果决策单元代码为6000000935，系统不自动生成1004-行驶证车主特别约定 2018-12-24 hujp start
        String decisionUnitCode = "";
        decisionUnitCode = CommonUtils.getParameter(paramMap,"GuMainApplyNo");
        clauseCode = deleteClauseCode1004ForSH(clauseCode,companyCode,riskCode,decisionUnitCode);
        // 上海机构 交强险特别约定：如果决策单元代码为6000000935，系统不自动生成1004-行驶证车主特别约定 2018-12-24 hujp end

        if( clauseCode.length()>0 ){
            clauseCode.deleteCharAt(clauseCode.length()-1);
            clauseCodeTemp.deleteCharAt(clauseCodeTemp.length()-1);

            String[] clauseCodes = clauseCodeTemp.toString().split(",");
            paramMap.put("currentRisk", riskCode);
            String language = CommonUtils.getParameter(paramMap, "language");
            paramMap.put("sessionLanguage", language);
            List guParamMappingDtoList = new ArrayList();
            GgClauseDto ggClauseDto = null;
            for( int i=0; i < clauseCodes.length ; i++){
                ggClauseDto = new GgClauseDto();
                ggClauseDto.setClauseCode(clauseCodes[i]);
                if("Endor".equals(businessType)){
                    if(riskSpecialMap != null && !riskSpecialMap.containsKey(riskCode + clauseCodes[i])){
                       // guParamMappingDtoList.addAll(ServiceManager.prpall.getGuProductRiskClauseService().makeClauseMapping(businessType, ggClauseDto, "2", "R", paramMap));
                    }
                }else{
                    if(riskSpecialMap != null && !riskSpecialMap.containsKey(clauseCodes[i])){
                      //  guParamMappingDtoList.addAll(ServiceManager.prpall.getGuProductRiskClauseService().makeClauseMapping(businessType, ggClauseDto, "2", "R", paramMap));
                    }
                }
            }

            if(paramMap.get("guParamMappingDtoList") != null && ((List)paramMap.get("guParamMappingDtoList")).size() > 0){
                guParamMappingDtoList.addAll((List)paramMap.get("guParamMappingDtoList"));
            }

            paramMap.put("guParamMappingDtoList", guParamMappingDtoList);
            paramMap.put("clauseCodes", clauseCode.toString());
          //  ServiceManager.prpall.getGuProductServiceTools().autoMappingClauseInfo(paramMap);

        }
        if ("Endor".equals(businessType)) {
           // ServiceManager.prpall.getGuProductRiskClauseService().dealSpecialClauses(paramMap, businessNo, planCode, riskCode);
        }
        return paramMap;
    }

    private StringBuffer deleteClauseCode1004ForSH(StringBuffer clauseCode, String companyCode, String riskCode, String decisionUnitCode) {

        if("0360".equals(companyCode.substring(0, 4))){
            String[] clauseCodes = clauseCode.toString().split(",");
            StringBuffer result = new StringBuffer();
            if(clauseCodes.length > 0 && "6000000935".equals(decisionUnitCode)){
                for(int i=0;i<clauseCodes.length;i++){
                    if(!"080110042".equals(clauseCodes[i])){
                        if(StringUtils.isNotEmpty(clauseCodes[i])){
                            result.append(clauseCodes[i] + ",");
                        }
                    }
                }
                return result;
            }
            return clauseCode;
        }else{
            return clauseCode;
        }
    }
}
