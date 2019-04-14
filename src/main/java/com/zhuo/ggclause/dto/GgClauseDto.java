package com.zhuo.ggclause.dto;

import com.zhuo.ggclause.dto.base.GgClauseDtoBase;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhuoshengqi
 * @date 2019/03/12  18:52
 * @description
 */
@Entity
public class GgClauseDto extends GgClauseDtoBase implements Serializable {

    /** 属性条款显示名称 */
    private String clauseShowName = null;

    /**属性条款类别*/
    private String clauseType=null;

    private String context = "";

    private String index = null;
    /** 属性条款范围 */
    private List clauseList = null;

    private String riskCode = null;

    private String kindCode = null;

    private List manualKeyList = null;

    private String modifyInd = null;

    private String riskKindInd = null;

    private String clauseText = null;

    private String clauseSysType=null;

    /**
     * 是否可重复选择条款
     */
    private String repeatInd = null;

    public String getClauseShowName() {
        return clauseShowName;
    }

    public void setClauseShowName(String clauseShowName) {
        this.clauseShowName = clauseShowName;
    }

    public String getClauseType() {
        return clauseType;
    }

    public void setClauseType(String clauseType) {
        this.clauseType = clauseType;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List getClauseList() {
        return clauseList;
    }

    public void setClauseList(List clauseList) {
        this.clauseList = clauseList;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public List getManualKeyList() {
        return manualKeyList;
    }

    public void setManualKeyList(List manualKeyList) {
        this.manualKeyList = manualKeyList;
    }

    public String getModifyInd() {
        return modifyInd;
    }

    public void setModifyInd(String modifyInd) {
        this.modifyInd = modifyInd;
    }

    public String getRiskKindInd() {
        return riskKindInd;
    }

    public void setRiskKindInd(String riskKindInd) {
        this.riskKindInd = riskKindInd;
    }

    public String getClauseText() {
        return clauseText;
    }

    public void setClauseText(String clauseText) {
        this.clauseText = clauseText;
    }

    public String getClauseSysType() {
        return clauseSysType;
    }

    public void setClauseSysType(String clauseSysType) {
        this.clauseSysType = clauseSysType;
    }

    public String getRepeatInd() {
        return repeatInd;
    }

    public void setRepeatInd(String repeatInd) {
        this.repeatInd = repeatInd;
    }
}
