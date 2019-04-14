package com.zhuo.ggclause.dto.base;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  9:31
 * @description
 */
@Entity
@Table(name = "GgRiskSpecialClause")
public class GgRiskSpecialClauseDtoBase {


    /**
     * 属性:RISKCODE<br>
     * 含义:险种代码：GGRisk表外键<br>
     */
    @Id
    private String riskCode = null;
    /**
     * 属性:CLAUSECODE<br>
     * 含义:条款代码：GGClause表外键<br>
     */
    private String clauseCode = null;
    /**
     * 属性:MODIFYIND<br>
     * 含义:修改标志：1-可删除，可修改，2-可修改、不可删除  3-不可修改、可删除 4-不可修改、不可删除。<br>
     */
    private String modifyInd = null;
    /**
     * 属性:CREATORCODE<br>
     * 含义:创建人<br>
     */
    private String creatorCode = null;
    /**
     * 属性:CREATETIME<br>
     * 含义:创建时间<br>
     */
    private Date createTime = null;
    /**
     * 属性:UPDATERCODE<br>
     * 含义:最后修改人<br>
     */
    private String updaterCode = null;
    /**
     * 属性:UPDATETIME<br>
     * 含义:最后修改时间<br>
     */
    private Date updateTime = null;
    /**
     * 属性:VALIDIND<br>
     * 含义:有效标志<br>
     */
    private String validInd = null;
    /**
     * 属性:REMARK<br>
     * 含义:备注<br>
     */
    private String remark = null;
    /**
     * 属性:FLAG<br>
     * 含义:标识<br>
     */
    private String flag = null;
    /**
     * 属性:COMPANYCODE<br>
     * 含义:使用机构<br>
     */
    private String companyCode = null;

    /**
     *含义：特约关联条款
     **/
    /**
     * 属性:RationType<br>
     * 含义:定额类型<br>
     */
    private String rationType = null;
    /**
     * 属性:vehicleClauseSysFlag<br>
     * 含义:车险条款标签 1.只有商车费改新条款才使<br>
     */
    private String vehicleClauseSysFlag = null;

    /**
     * 设置属性RISKCODE<br>
     * 含义:险种代码：GGRisk表外键<br>
     * @param riskCode 待设置的属性RISKCODE的值
     */
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    /**
     * 获取属性RISKCODE<br>
     * 含义:险种代码：GGRisk表外键<br>
     * @return 属性RISKCODE的值
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * 设置属性CLAUSECODE<br>
     * 含义:条款代码：GGClause表外键<br>
     * @param clauseCode 待设置的属性CLAUSECODE的值
     */
    public void setClauseCode(String clauseCode) {
        this.clauseCode = clauseCode;
    }

    /**
     * 获取属性CLAUSECODE<br>
     * 含义:条款代码：GGClause表外键<br>
     * @return 属性CLAUSECODE的值
     */
    public String getClauseCode() {
        return clauseCode;
    }

    /**
     * 设置属性MODIFYIND<br>
     * 含义:修改标志：1-可删除，可修改，2-可修改、不可删除  3-不可修改、可删除 4-不可修改、不可删除。<br>
     * @param modifyInd 待设置的属性MODIFYIND的值
     */
    public void setModifyInd(String modifyInd) {
        this.modifyInd = modifyInd;
    }

    /**
     * 获取属性MODIFYIND<br>
     * 含义:修改标志：1-可删除，可修改，2-可修改、不可删除  3-不可修改、可删除 4-不可修改、不可删除。<br>
     * @return 属性MODIFYIND的值
     */
    public String getModifyInd() {
        return modifyInd;
    }

    /**
     * 设置属性CREATORCODE<br>
     * 含义:创建人<br>
     * @param creatorCode 待设置的属性CREATORCODE的值
     */
    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    /**
     * 获取属性CREATORCODE<br>
     * 含义:创建人<br>
     * @return 属性CREATORCODE的值
     */
    public String getCreatorCode() {
        return creatorCode;
    }

    /**
     * 设置属性CREATETIME<br>
     * 含义:创建时间<br>
     * @param createTime 待设置的属性CREATETIME的值
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取属性CREATETIME<br>
     * 含义:创建时间<br>
     * @return 属性CREATETIME的值
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置属性UPDATERCODE<br>
     * 含义:最后修改人<br>
     * @param updaterCode 待设置的属性UPDATERCODE的值
     */
    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode;
    }

    /**
     * 获取属性UPDATERCODE<br>
     * 含义:最后修改人<br>
     * @return 属性UPDATERCODE的值
     */
    public String getUpdaterCode() {
        return updaterCode;
    }

    /**
     * 设置属性UPDATETIME<br>
     * 含义:最后修改时间<br>
     * @param updateTime 待设置的属性UPDATETIME的值
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取属性UPDATETIME<br>
     * 含义:最后修改时间<br>
     * @return 属性UPDATETIME的值
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置属性VALIDIND<br>
     * 含义:有效标志<br>
     * @param validInd 待设置的属性VALIDIND的值
     */
    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    /**
     * 获取属性VALIDIND<br>
     * 含义:有效标志<br>
     * @return 属性VALIDIND的值
     */
    public String getValidInd() {
        return validInd;
    }

    /**
     * 设置属性REMARK<br>
     * 含义:备注<br>
     * @param remark 待设置的属性REMARK的值
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取属性REMARK<br>
     * 含义:备注<br>
     * @return 属性REMARK的值
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置属性FLAG<br>
     * 含义:标识<br>
     * @param flag 待设置的属性FLAG的值
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 获取属性FLAG<br>
     * 含义:标识<br>
     * @return 属性FLAG的值
     */
    public String getFlag() {
        return flag;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     *含义：特约关联条款
     **/
    private String relationClauseCode =null;

    public String getRelationClauseCode() {
        return relationClauseCode;
    }

    public void setRelationClauseCode(String relationClauseCode) {
        this.relationClauseCode = relationClauseCode;
    }

    /**
     * 设置属性RationType<br>
     * 含义:定额类型<br>
     * @param rationType 待设置的属性RationType的值
     */
    public void setRationType(String rationType) {
        this.rationType = rationType;
    }

    /**
     * 获取属性RationType<br>
     * 含义:定额类型<br>
     * @return 属性RationType的值
     */
    public String getRationType() {
        return rationType;
    }


    public String getVehicleClauseSysFlag() {
        return vehicleClauseSysFlag;
    }

    public void setVehicleClauseSysFlag(String vehicleClauseSysFlag) {
        this.vehicleClauseSysFlag = vehicleClauseSysFlag;
    }

    /**
     * 比较两个对象在逻辑上是否相等
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GgRiskSpecialClauseDtoBase)) {
            return false;
        }

        final GgRiskSpecialClauseDtoBase otherDto = (GgRiskSpecialClauseDtoBase) other;
        if (getRiskCode()!=null && !getRiskCode().equals(otherDto.getRiskCode())) {
            return false;
        }
        if (getClauseCode()!=null && !getClauseCode().equals(otherDto.getClauseCode())) {
            return false;
        }
        return true;
    }

    /**
     * 根据主键生成HashCode
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        StringBuilder buffer = new StringBuilder();
        buffer.append('|').append(riskCode);
        buffer.append('|').append(clauseCode);
        return buffer.toString().hashCode();
    }
}
