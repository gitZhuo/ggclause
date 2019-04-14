package com.zhuo.ggclause.dto.base;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zhuoshengqi
 * @date 2019/03/12  18:49
 * @description
 */
@Entity
@Table(name = "GgClause")
public class GgClauseDtoBase {

    /**
     * 属性:条款代码<br>
     */
    @Id
    private String clauseCode = null;
    /**
     * 属性:条款简体中文名称<br>
     */
    private String clauseCName = null;
    /**
     * 属性:条款繁体中文名称<br>
     */
    private String clauseTName = null;
    /**
     * 属性:条款英文名称<br>
     */
    private String clauseEName = null;
    /**
     * 属性:语种<br>
     * 含义:(C/T/E/…)，详见GGType.codeType='Language'<br>
     */
    private String language = null;
    /**
     * 属性:险类<br>
     * 含义:险类代码如果是公共条款，险类为00，详见险类代码表GGRiskClass<br>
     */
    private String riskClass = null;
    /**
     * 属性:创建人<br>
     */
    private String creatorCode = null;
    /**
     * 属性:创建时间<br>
     */
    private Date createTime = null;
    /**
     * 属性:最后修改人<br>
     */
    private String updaterCode = null;
    /**
     * 属性:最后修改时间<br>
     */
    private Date updateTime = null;
    /**
     * 属性:生效日期<br>
     */
    private Date validDate = null;
    /**
     * 属性:失效日期<br>
     */
    private Date invalidDate = null;
    /**
     * 属性:有效标志<br>
     * 含义:1-有效；0-无效<br>
     */
    private String validInd = null;
    /**
     * 属性:备注<br>
     */
    private String remark = null;
    /**
     * 属性:标志字段<br>
     * 含义:备用标志字段<br>
     */
    private String flag = null;
    /**
     * 属性:允许修改标志<br>
     * 含义:允许修改标志,0:只读  1:可以修改<br>
     */
    private String readOnlyInd = null;
    /**
     * 属性:条款中文全称<br>
     * 含义:条款中文全称<br>
     */
    private String clauseLongCName = null;
    /**
     * 属性:条款繁体全称<br>
     * 含义:条款繁体全称<br>
     */
    private String clauseLongTName = null;
    /**
     * 属性:条款英文全称<br>
     * 含义:条款英文全称<br>
     */
    private String clauseLongEName = null;
    /**
     * 属性:条款备案号<br>
     * 含义:条款备案号<br>
     */
    private String recordNumber = null;

    public String getClauseCode() {
        return clauseCode;
    }

    public void setClauseCode(String clauseCode) {
        this.clauseCode = clauseCode;
    }

    public String getClauseCName() {
        return clauseCName;
    }

    public void setClauseCName(String clauseCName) {
        this.clauseCName = clauseCName;
    }

    public String getClauseTName() {
        return clauseTName;
    }

    public void setClauseTName(String clauseTName) {
        this.clauseTName = clauseTName;
    }

    public String getClauseEName() {
        return clauseEName;
    }

    public void setClauseEName(String clauseEName) {
        this.clauseEName = clauseEName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRiskClass() {
        return riskClass;
    }

    public void setRiskClass(String riskClass) {
        this.riskClass = riskClass;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdaterCode() {
        return updaterCode;
    }

    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public String getValidInd() {
        return validInd;
    }

    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getReadOnlyInd() {
        return readOnlyInd;
    }

    public void setReadOnlyInd(String readOnlyInd) {
        this.readOnlyInd = readOnlyInd;
    }

    public String getClauseLongCName() {
        return clauseLongCName;
    }

    public void setClauseLongCName(String clauseLongCName) {
        this.clauseLongCName = clauseLongCName;
    }

    public String getClauseLongTName() {
        return clauseLongTName;
    }

    public void setClauseLongTName(String clauseLongTName) {
        this.clauseLongTName = clauseLongTName;
    }

    public String getClauseLongEName() {
        return clauseLongEName;
    }

    public void setClauseLongEName(String clauseLongEName) {
        this.clauseLongEName = clauseLongEName;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
