package com.zhuo.ggclause.dto.base;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  9:29
 * @description
 */
@Entity
@Table(name = "GgCompany")
public class GgCompanyDtoBase {

    @Id
    private String companyCode = null;
    private String companyCName = null;
    private String companyTName = null;
    private String companyEName = null;
    private String addressCName = null;
    private String addressTName = null;
    private String addressEName = null;
    private String insurerCName = null;
    private String insurerTName = null;
    private String insurerEName = null;
    private String upperCompanyCode = null;
    private String comAttribute = null;
    private String comType = null;
    private String centerInd = null;
    private String comLevel = null;
    private String filialeType = null;
    private String comBusLevel = null;
    private String sameCityInd = null;
    private String comKind = null;
    private String postCode = null;
    private String phoneNumber = null;
    private String faxNumber = null;
    private String manager = null;
    private String webAddress = null;
    private String servicePhone = null;
    private String reportPhone = null;
    private String creatorCode = null;
    private Date createTime = null;
    private String updaterCode = null;
    private Date updateTime = null;
    private String validInd = null;
    private String remark = null;
    private String flag = null;
    private String shortCName = null;
    private String shortTName = null;
    private String shortEName = null;
    private String taxNumber = null;
    private String email = null;
    private String adminArea = null;
    private String companyState = null;
    private Date startDate = null;
    private Date restartDate = null;
    private Date workDate = null;
    private String cityCode = null;
    private String countyCode = null;
    private String countyKind = null;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyCName() {
        return companyCName;
    }

    public void setCompanyCName(String companyCName) {
        this.companyCName = companyCName;
    }

    public String getCompanyTName() {
        return companyTName;
    }

    public void setCompanyTName(String companyTName) {
        this.companyTName = companyTName;
    }

    public String getCompanyEName() {
        return companyEName;
    }

    public void setCompanyEName(String companyEName) {
        this.companyEName = companyEName;
    }

    public String getAddressCName() {
        return addressCName;
    }

    public void setAddressCName(String addressCName) {
        this.addressCName = addressCName;
    }

    public String getAddressTName() {
        return addressTName;
    }

    public void setAddressTName(String addressTName) {
        this.addressTName = addressTName;
    }

    public String getAddressEName() {
        return addressEName;
    }

    public void setAddressEName(String addressEName) {
        this.addressEName = addressEName;
    }

    public String getInsurerCName() {
        return insurerCName;
    }

    public void setInsurerCName(String insurerCName) {
        this.insurerCName = insurerCName;
    }

    public String getInsurerTName() {
        return insurerTName;
    }

    public void setInsurerTName(String insurerTName) {
        this.insurerTName = insurerTName;
    }

    public String getInsurerEName() {
        return insurerEName;
    }

    public void setInsurerEName(String insurerEName) {
        this.insurerEName = insurerEName;
    }

    public String getUpperCompanyCode() {
        return upperCompanyCode;
    }

    public void setUpperCompanyCode(String upperCompanyCode) {
        this.upperCompanyCode = upperCompanyCode;
    }

    public String getComAttribute() {
        return comAttribute;
    }

    public void setComAttribute(String comAttribute) {
        this.comAttribute = comAttribute;
    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getCenterInd() {
        return centerInd;
    }

    public void setCenterInd(String centerInd) {
        this.centerInd = centerInd;
    }

    public String getComLevel() {
        return comLevel;
    }

    public void setComLevel(String comLevel) {
        this.comLevel = comLevel;
    }

    public String getFilialeType() {
        return filialeType;
    }

    public void setFilialeType(String filialeType) {
        this.filialeType = filialeType;
    }

    public String getComBusLevel() {
        return comBusLevel;
    }

    public void setComBusLevel(String comBusLevel) {
        this.comBusLevel = comBusLevel;
    }

    public String getSameCityInd() {
        return sameCityInd;
    }

    public void setSameCityInd(String sameCityInd) {
        this.sameCityInd = sameCityInd;
    }

    public String getComKind() {
        return comKind;
    }

    public void setComKind(String comKind) {
        this.comKind = comKind;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getReportPhone() {
        return reportPhone;
    }

    public void setReportPhone(String reportPhone) {
        this.reportPhone = reportPhone;
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

    public String getShortCName() {
        return shortCName;
    }

    public void setShortCName(String shortCName) {
        this.shortCName = shortCName;
    }

    public String getShortTName() {
        return shortTName;
    }

    public void setShortTName(String shortTName) {
        this.shortTName = shortTName;
    }

    public String getShortEName() {
        return shortEName;
    }

    public void setShortEName(String shortEName) {
        this.shortEName = shortEName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdminArea() {
        return adminArea;
    }

    public void setAdminArea(String adminArea) {
        this.adminArea = adminArea;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getRestartDate() {
        return restartDate;
    }

    public void setRestartDate(Date restartDate) {
        this.restartDate = restartDate;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyKind() {
        return countyKind;
    }

    public void setCountyKind(String countyKind) {
        this.countyKind = countyKind;
    }
}
