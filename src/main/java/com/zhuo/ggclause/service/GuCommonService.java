package com.zhuo.ggclause.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author zhuoshengqi
 * @date 2019/03/12  18:38
 * @description
 */
@Service
public class GuCommonService {

    private JdbcTemplate jdbcTemplate =new JdbcTemplate();

    public String getBusinessRiskClauseSysType(String businessType, String businessNo, String riskCode) throws Exception {

        StringBuilder sql = new StringBuilder(50);
        if("1359".equals(riskCode)){
            riskCode = "0802";
        }else if("1360".equals(riskCode)){
            riskCode = "0803";
        }
        sql.append("select ClauseSysType from ");
        if ("Endor".equals(businessType)) {
            sql.append("guendorrisk where endorno = ? and riskcode = ? and rownum = 1");
        }else if ("Proposal".equals(businessType) || "Renewal".equals(businessType)){
            sql.append("guproposalrisk where proposalno = ? and riskcode = ? and rownum = 1");
        }else if ("Policy".equals(businessType)) {
            sql.append("gupolicyrisk where policyno = ? and riskcode = ? and rownum = 1");
        }else if ("PolicyCopy".equals(businessType)) {
            sql.append("gupolicycopyrisk where policyno = ? and riskcode = ? and endorseqno = '000' and rownum = 1");
        }else{
            return "";
        }
        try{
            Object result = jdbcTemplate.queryForObject(sql.toString(), new Object []{businessNo,riskCode},String.class);
            if (result==null)
                return "";
            else
                return (String) result;
        }catch(Exception ex){
            throw new Exception("GuCommonServiceSpringImpl。getRiskClauseSysCode查询险种表Risk的条款体系代码出现未知异常。") ;
        }
    }
}
