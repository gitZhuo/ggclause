package com.zhuo.ggclause.dto.base;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  16:43
 * @description
 */
@Entity
@Table(name = "GuProposalRisk")
public class GuProposalRiskDtoBase implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 属性:投保单号码<br>
     */
    @Id
    private String proposalNo = null;
    /**
     * 属性:计划代码<br>
     * 含义:0000表示没有计划<br>
     */
    private String planCode = null;
    /**
     * 属性:险种代码<br>
     * 含义:▲来源于GGRisk.RiskCode<br>
     */
    private String riskCode = null;
    /**
     * 属性:起保日期<br>
     */
    private Date startDate = null;

    /**
     * 属性:即时生效日期<br>
     */
    private Date immEffectStartDate = null;


    /**
     * 即时生效类型
     */
    private String immEffectType=null;


    /**
     * 属性:终保日期<br>
     */
    private Date endDate = null;
    /**
     * 属性:起保时区<br>
     */
    private String startTimeZone = null;
    /**
     * 属性:终保时区<br>
     */
    private String endTimeZone = null;
    /**
     * 属性:投保公司保单开始日<br>
     * 含义:历次投保记录中最早一张保单的起保日期<br>
     */
    private Date commenceDate = null;
    /**
     * 属性:追溯起始日期<br>
     */
    private Date retroactiveStartDate = null;
    /**
     * 属性:追溯终止日期<br>
     */
    private Date retroactiveEndDate = null;
    /**
     * 属性:保单币别<br>
     * 含义:▲来源于GGCurrency.CurrencyCode<br>
     */
    private String currency = null;
    /**
     * 属性:总保险价值<br>
     */
    private Double sumValue = null;
    /**
     * 属性:总保额<br>
     */
    private Double sumInsured = null;
    /**
     * 属性:总毛保费<br>
     */
    private Double sumGrossPremium = null;
    /**
     * 属性:总佣金/折扣金额<br>
     */
    private Double commission = null;
    /**
     * 属性:总佣金/折扣率<br>
     */
    private Double discount = null;
    /**
     * 属性:总净保费<br>
     */
    private Double sumNetPremium = null;
    /**
     * 属性:加减费<br>
     */
    private Double loading = null;
    /**
     * 属性:司法管辖代码<br>
     * 含义:▲来源于GGCode.codetype='JudicalCode' 的代码<br>
     */
    private String judicalCode = null;
    /**
     * 属性:司法管辖<br>
     * 含义:▲来源于GGCode.codetype='JudicalCode' 的代码名称<br>
     */
    private String judicalScope = null;
    /**
     * 属性:承保年度<br>
     */
    private String uwYear = null;
    /**
     * 属性:承保地区<br>
     * 含义:▲来源于GGCode.codetype='GeographicalArea' 的代码<br>
     */
    private String geographicalArea = null;
    /**
     * 属性:申报标志<br>
     */
    private String declarationInd = null;
    /**
     * 属性:申报时限<br>
     * 含义:单位:天<br>
     */
    private String declarationInterval = null;
    /**
     * 属性:最低保费标志<br>
     */
    private String lowestPremiumInd = null;
    /**
     * 属性:最低保费币别<br>
     * 含义:若为单险种 ▲来源于GGRiskminpremium.currency
     若为计划 ▲来源于GGPlanminpremium.currency<br>
     */
    private String lowestPremCurrency = null;
    /**
     * 属性:最低保费金额<br>
     */
    private Double lowestPremium = null;
    /**
     * 属性:佣金毛费/净费比例标志<br>
     */
    private String commissionRateInd = null;
    /**
     * 属性:外部备注<br>
     */
    private String outerRemark = null;
    /**
     * 属性:备注<br>
     */
    private String remark = null;
    /**
     * 属性:有效标志<br>
     * 含义:0:无效；1:有效<br>
     */
    private String validInd = null;
    /**
     * 属性:标志字段<br>
     */
    private String flag = null;
    /**
     * 属性:申报保费调整标志<br>
     * 含义:申报保费调整标志 1：是，0：否<br>
     */
    private String adjustmentInd = null;
    /**
     * 属性:总承保保费<br>
     */
    private Double sumUWPremium = null;
    /**
     * 属性:承保地区描述<br>
     * 含义:▲来源于GGCode.codetype='GeographicalArea' 的代码名称<br>
     */
    private String geographicalAreaDesc = null;
    /**
     * 属性:发现起始日期<br>
     * 含义:发现起始日期<br>
     */
    private Date discoverStartDate = null;
    /**
     * 属性:发现中止日期<br>
     * 含义:发现中止日期<br>
     */
    private Date discoverEndDate = null;
    /**
     * 属性:索赔方式<br>
     * 含义:0-期内索赔制，1-期内发生制<br>
     */
    private String compensationType = null;
    /**
     * 属性:分单号<br>
     * 含义:分单号<br>
     */
    private String subProposalNo = null;
    /**
     * 属性:保险年度天数<br>
     */
    private Integer uwYearDays = null;
    /**
     * 属性:是否合并录单<br>
     * 含义:是否合并录单,1:是，0:否<br>
     */
    private String combineInd = null;
    /**
     * 属性:倒签天数<br>
     * 含义:倒签天数<br>
     */
    private Long backDays = null;
    /**
     * 属性:延期后保单终保日期<br>
     * 含义:延期后保单终保日期<br>
     */
    private Date delayFinalEndDate = null;
    /**
     * 属性:延期终止日期<br>
     * 含义:延期终止日期<br>
     */
    private Date delayEndDate = null;
    /**
     * 属性:提奖比例<br>
     * 含义:提奖比例<br>
     */
    private Double bonusRate = null;
    /**
     * 属性:参考提奖比例<br>
     * 含义:参考提奖比例<br>
     */
    private Double referBonusRate = null;
    /**
     * 属性:详细承保地区<br>
     * 含义:详细承保地区<br>
     */
    private String geographicalAreaDetail = null;
    /**
     * 属性:延期起始日期<br>
     * 含义:延期起始日期<br>
     */
    private Date delayStartDate = null;
    /**
     * 属性:延期期限(天数)<br>
     * 含义:延期期限(天数)<br>
     */
    private Integer delayTime = null;
    /**
     * 属性:业务分类<br>
     * 含义:业务分类(规则匹配用)<br>
     */
    private String businessClass = null;
    /**
     * 属性:共保标志<br>
     * 含义:0:非联共保;1:主共保;2:从共保<br>
     */
    private String coinsInd = null;
    /**
     * 属性:特殊分保标志<br>
     * 含义:特殊分保标志: 1-是, 0-否<br>
     */
    private String specialReinsInd = null;
    /**
     * 属性:是否重新匹配佣金<br>
     * 含义:是否重新匹配佣金.codeType=YesNoInd  0-否 1-是<br>
     */
    private String updateCommissionInd = null;
    /**
     * 属性:退保标志<br>
     * 含义:退保标志<br>
     */
    private String surrenderInd = null;
    /**
     * 属性:申报说明<br>
     * 含义:申报说明<br>
     */
    private String declarationExplain = null;
    /**
     * 属性:险种适用范围<br>
     * 含义:险种适用范围<br>
     */
    private String riskApplyType = null;
    /**
     * 属性:产品版本<br>
     * 含义:产品版本<br>
     */
    private String productEdition = null;
    /**
     * 属性:批改保费计算模式<br>
     */
    private String endorCalculateMode = null;
    /**
     * 属性:即时生效标志<br>
     */
    private String effectFlag = null;
    /**
     * 属性:分保单号<br>
     */
    private String subPolicyNo = null;
    /**
     * 属性:涉农标志<br>
     */
    private String agricultureFlag = null;
    /**
     * 属性:保费计算信息编码<br>
     */
    private String calculateInfoCode = null;

    /**
     * 属性：条款体系代码
     */
    private String clauseSysType = null;

    /**
     * 属性：产品体系代码
     */
    private String productSysType = null;

    /**
     * 属性：电子保单标志
     */
    private String isElectronicPolicy = null;

    /**
     * 属性：电子投保单标志
     */
    private String isElectronicProposal = null;

    /**
     * 属性：全程批改标识，1-是，0-否；
     */
    private String isFullEndor = null;


    /**
     *属性：增值税额<br>
     */
    private  Double sumAddTax = null;


    /**
     *属性：加权增值税率<br>
     */
    private  Double sumAddTaxRate = null;


    /**
     *属性：价税合计试算（原承保保费）<br>
     */
    private  Double sumUwPriceTaxTotal = null;


    /**
     *属性：价税合计<br>
     */
    private  Double sumPriceTaxTotal = null;

    /**
     * 属性：理赔绿色通道标识，1-是，0-否；
     */
    private String claimGreenPassSign = null;


    /**
     *设置属性增值税额<br>
     *@param SumAddTax 待设置的属性增值税额的值
     */
    public void setSumAddTax(Double sumAddTax){
        this.sumAddTax = sumAddTax;
    }


    /**
     *获取属性增值税额<br>
     *@return SumAddTax 属性增值税额的值
     */
    public Double getSumAddTax(){
        return sumAddTax;
    }


    /**
     *设置属性加权增值税率<br>
     *@param SumAddTaxRate 待设置的属性加权增值税率的值
     */
    public void setSumAddTaxRate(Double sumAddTaxRate){
        this.sumAddTaxRate = sumAddTaxRate;
    }


    /**
     *获取属性加权增值税率<br>
     *@return SumAddTaxRate 属性加权增值税率的值
     */
    public Double getSumAddTaxRate(){
        return sumAddTaxRate;
    }


    /**
     *设置属性价税合计试算（原承保保费）<br>
     *@param SumUwPriceTaxTotal 待设置的属性价税合计试算（原承保保费）的值
     */
    public void setSumUwPriceTaxTotal(Double sumUwPriceTaxTotal){
        this.sumUwPriceTaxTotal = sumUwPriceTaxTotal;
    }


    /**
     *获取属性价税合计试算（原承保保费）<br>
     *@return SumUwPriceTaxTotal 属性价税合计试算（原承保保费）的值
     */
    public Double getSumUwPriceTaxTotal(){
        return sumUwPriceTaxTotal;
    }


    /**
     *设置属性价税合计<br>
     *@param SumPriceTaxTotal 待设置的属性价税合计的值
     */
    public void setSumPriceTaxTotal(Double sumPriceTaxTotal){
        this.sumPriceTaxTotal = sumPriceTaxTotal;
    }


    /**
     *获取属性价税合计<br>
     *@return SumPriceTaxTotal 属性价税合计的值
     */
    public Double getSumPriceTaxTotal(){
        return sumPriceTaxTotal;
    }




    public String getIsFullEndor() {
        return isFullEndor;
    }

    public void setIsFullEndor(String isFullEndor) {
        this.isFullEndor = isFullEndor;
    }

    /**
     * 设置属性投保单号码<br>
     * @param proposalNo 待设置的属性投保单号码的值
     */
    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }

    /**
     * 获取属性投保单号码<br>
     * @return 属性投保单号码的值
     */
    public String getProposalNo() {
        return proposalNo;
    }

    /**
     * 设置属性计划代码<br>
     * 含义:0000表示没有计划<br>
     * @param planCode 待设置的属性计划代码的值
     */
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    /**
     * 获取属性计划代码<br>
     * 含义:0000表示没有计划<br>
     * @return 属性计划代码的值
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * 设置属性险种代码<br>
     * 含义:▲来源于GGRisk.RiskCode<br>
     * @param riskCode 待设置的属性险种代码的值
     */
    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    /**
     * 获取属性险种代码<br>
     * 含义:▲来源于GGRisk.RiskCode<br>
     * @return 属性险种代码的值
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * 设置属性起保日期<br>
     * @param startDate 待设置的属性起保日期的值
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取属性起保日期<br>
     * @return 属性起保日期的值
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置属性终保日期<br>
     * @param endDate 待设置的属性终保日期的值
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取属性终保日期<br>
     * @return 属性终保日期的值
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置属性起保时区<br>
     * @param startTimeZone 待设置的属性起保时区的值
     */
    public void setStartTimeZone(String startTimeZone) {
        this.startTimeZone = startTimeZone;
    }

    /**
     * 获取属性起保时区<br>
     * @return 属性起保时区的值
     */
    public String getStartTimeZone() {
        return startTimeZone;
    }

    /**
     * 设置属性终保时区<br>
     * @param endTimeZone 待设置的属性终保时区的值
     */
    public void setEndTimeZone(String endTimeZone) {
        this.endTimeZone = endTimeZone;
    }

    /**
     * 获取属性终保时区<br>
     * @return 属性终保时区的值
     */
    public String getEndTimeZone() {
        return endTimeZone;
    }

    /**
     * 设置属性投保公司保单开始日<br>
     * 含义:历次投保记录中最早一张保单的起保日期<br>
     * @param commenceDate 待设置的属性投保公司保单开始日的值
     */
    public void setCommenceDate(Date commenceDate) {
        this.commenceDate = commenceDate;
    }

    /**
     * 获取属性投保公司保单开始日<br>
     * 含义:历次投保记录中最早一张保单的起保日期<br>
     * @return 属性投保公司保单开始日的值
     */
    public Date getCommenceDate() {
        return commenceDate;
    }

    /**
     * 设置属性追溯起始日期<br>
     * @param retroactiveStartDate 待设置的属性追溯起始日期的值
     */
    public void setRetroactiveStartDate(Date retroactiveStartDate) {
        this.retroactiveStartDate = retroactiveStartDate;
    }

    /**
     * 获取属性追溯起始日期<br>
     * @return 属性追溯起始日期的值
     */
    public Date getRetroactiveStartDate() {
        return retroactiveStartDate;
    }

    /**
     * 设置属性追溯终止日期<br>
     * @param retroactiveEndDate 待设置的属性追溯终止日期的值
     */
    public void setRetroactiveEndDate(Date retroactiveEndDate) {
        this.retroactiveEndDate = retroactiveEndDate;
    }

    /**
     * 获取属性追溯终止日期<br>
     * @return 属性追溯终止日期的值
     */
    public Date getRetroactiveEndDate() {
        return retroactiveEndDate;
    }

    /**
     * 设置属性保单币别<br>
     * 含义:▲来源于GGCurrency.CurrencyCode<br>
     * @param currency 待设置的属性保单币别的值
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取属性保单币别<br>
     * 含义:▲来源于GGCurrency.CurrencyCode<br>
     * @return 属性保单币别的值
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置属性总保险价值<br>
     * @param sumValue 待设置的属性总保险价值的值
     */
    public void setSumValue(Double sumValue) {
        this.sumValue = sumValue;
    }

    /**
     * 获取属性总保险价值<br>
     * @return 属性总保险价值的值
     */
    public Double getSumValue() {
        return sumValue;
    }

    /**
     * 设置属性总保额<br>
     * @param sumInsured 待设置的属性总保额的值
     */
    public void setSumInsured(Double sumInsured) {
        this.sumInsured = sumInsured;
    }

    /**
     * 获取属性总保额<br>
     * @return 属性总保额的值
     */
    public Double getSumInsured() {
        return sumInsured;
    }

    /**
     * 设置属性总毛保费<br>
     * @param sumGrossPremium 待设置的属性总毛保费的值
     */
    public void setSumGrossPremium(Double sumGrossPremium) {
        this.sumGrossPremium = sumGrossPremium;
    }

    /**
     * 获取属性总毛保费<br>
     * @return 属性总毛保费的值
     */
    public Double getSumGrossPremium() {
        return sumGrossPremium;
    }

    /**
     * 设置属性总佣金/折扣金额<br>
     * @param commission 待设置的属性总佣金/折扣金额的值
     */
    public void setCommission(Double commission) {
        this.commission = commission;
    }

    /**
     * 获取属性总佣金/折扣金额<br>
     * @return 属性总佣金/折扣金额的值
     */
    public Double getCommission() {
        return commission;
    }

    /**
     * 设置属性总佣金/折扣率<br>
     * @param discount 待设置的属性总佣金/折扣率的值
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 获取属性总佣金/折扣率<br>
     * @return 属性总佣金/折扣率的值
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 设置属性总净保费<br>
     * @param sumNetPremium 待设置的属性总净保费的值
     */
    public void setSumNetPremium(Double sumNetPremium) {
        this.sumNetPremium = sumNetPremium;
    }

    /**
     * 获取属性总净保费<br>
     * @return 属性总净保费的值
     */
    public Double getSumNetPremium() {
        return sumNetPremium;
    }

    /**
     * 设置属性加减费<br>
     * @param loading 待设置的属性加减费的值
     */
    public void setLoading(Double loading) {
        this.loading = loading;
    }

    /**
     * 获取属性加减费<br>
     * @return 属性加减费的值
     */
    public Double getLoading() {
        return loading;
    }

    /**
     * 设置属性司法管辖代码<br>
     * 含义:▲来源于GGCode.codetype='JudicalCode' 的代码<br>
     * @param judicalCode 待设置的属性司法管辖代码的值
     */
    public void setJudicalCode(String judicalCode) {
        this.judicalCode = judicalCode;
    }

    /**
     * 获取属性司法管辖代码<br>
     * 含义:▲来源于GGCode.codetype='JudicalCode' 的代码<br>
     * @return 属性司法管辖代码的值
     */
    public String getJudicalCode() {
        return judicalCode;
    }

    /**
     * 设置属性司法管辖<br>
     * 含义:▲来源于GGCode.codetype='JudicalCode' 的代码名称<br>
     * @param judicalScope 待设置的属性司法管辖的值
     */
    public void setJudicalScope(String judicalScope) {
        this.judicalScope = judicalScope;
    }

    /**
     * 获取属性司法管辖<br>
     * 含义:▲来源于GGCode.codetype='JudicalCode' 的代码名称<br>
     * @return 属性司法管辖的值
     */
    public String getJudicalScope() {
        return judicalScope;
    }

    /**
     * 设置属性承保年度<br>
     * @param uwYear 待设置的属性承保年度的值
     */
    public void setUwYear(String uwYear) {
        this.uwYear = uwYear;
    }

    /**
     * 获取属性承保年度<br>
     * @return 属性承保年度的值
     */
    public String getUwYear() {
        return uwYear;
    }

    /**
     * 设置属性承保地区<br>
     * 含义:▲来源于GGCode.codetype='GeographicalArea' 的代码<br>
     * @param geographicalArea 待设置的属性承保地区的值
     */
    public void setGeographicalArea(String geographicalArea) {
        this.geographicalArea = geographicalArea;
    }

    /**
     * 获取属性承保地区<br>
     * 含义:▲来源于GGCode.codetype='GeographicalArea' 的代码<br>
     * @return 属性承保地区的值
     */
    public String getGeographicalArea() {
        return geographicalArea;
    }

    /**
     * 设置属性申报标志<br>
     * @param declarationInd 待设置的属性申报标志的值
     */
    public void setDeclarationInd(String declarationInd) {
        this.declarationInd = declarationInd;
    }

    /**
     * 获取属性申报标志<br>
     * @return 属性申报标志的值
     */
    public String getDeclarationInd() {
        return declarationInd;
    }

    /**
     * 设置属性申报时限<br>
     * 含义:单位:天<br>
     * @param declarationInterval 待设置的属性申报时限的值
     */
    public void setDeclarationInterval(String declarationInterval) {
        this.declarationInterval = declarationInterval;
    }

    /**
     * 获取属性申报时限<br>
     * 含义:单位:天<br>
     * @return 属性申报时限的值
     */
    public String getDeclarationInterval() {
        return declarationInterval;
    }

    /**
     * 设置属性最低保费标志<br>
     * @param lowestPremiumInd 待设置的属性最低保费标志的值
     */
    public void setLowestPremiumInd(String lowestPremiumInd) {
        this.lowestPremiumInd = lowestPremiumInd;
    }

    /**
     * 获取属性最低保费标志<br>
     * @return 属性最低保费标志的值
     */
    public String getLowestPremiumInd() {
        return lowestPremiumInd;
    }

    /**
     * 设置属性最低保费币别<br>
     * 含义:若为单险种 ▲来源于GGRiskminpremium.currency
     若为计划 ▲来源于GGPlanminpremium.currency<br>
     * @param lowestPremCurrency 待设置的属性最低保费币别的值
     */
    public void setLowestPremCurrency(String lowestPremCurrency) {
        this.lowestPremCurrency = lowestPremCurrency;
    }

    /**
     * 获取属性最低保费币别<br>
     * 含义:若为单险种 ▲来源于GGRiskminpremium.currency
     若为计划 ▲来源于GGPlanminpremium.currency<br>
     * @return 属性最低保费币别的值
     */
    public String getLowestPremCurrency() {
        return lowestPremCurrency;
    }

    /**
     * 设置属性最低保费金额<br>
     * @param lowestPremium 待设置的属性最低保费金额的值
     */
    public void setLowestPremium(Double lowestPremium) {
        this.lowestPremium = lowestPremium;
    }

    /**
     * 获取属性最低保费金额<br>
     * @return 属性最低保费金额的值
     */
    public Double getLowestPremium() {
        return lowestPremium;
    }

    /**
     * 设置属性佣金毛费/净费比例标志<br>
     * @param commissionRateInd 待设置的属性佣金毛费/净费比例标志的值
     */
    public void setCommissionRateInd(String commissionRateInd) {
        this.commissionRateInd = commissionRateInd;
    }

    /**
     * 获取属性佣金毛费/净费比例标志<br>
     * @return 属性佣金毛费/净费比例标志的值
     */
    public String getCommissionRateInd() {
        return commissionRateInd;
    }

    /**
     * 设置属性外部备注<br>
     * @param outerRemark 待设置的属性外部备注的值
     */
    public void setOuterRemark(String outerRemark) {
        this.outerRemark = outerRemark;
    }

    /**
     * 获取属性外部备注<br>
     * @return 属性外部备注的值
     */
    public String getOuterRemark() {
        return outerRemark;
    }

    /**
     * 设置属性备注<br>
     * @param remark 待设置的属性备注的值
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取属性备注<br>
     * @return 属性备注的值
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置属性有效标志<br>
     * 含义:0:无效；1:有效<br>
     * @param validInd 待设置的属性有效标志的值
     */
    public void setValidInd(String validInd) {
        this.validInd = validInd;
    }

    /**
     * 获取属性有效标志<br>
     * 含义:0:无效；1:有效<br>
     * @return 属性有效标志的值
     */
    public String getValidInd() {
        return validInd;
    }

    /**
     * 设置属性标志字段<br>
     * @param flag 待设置的属性标志字段的值
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 获取属性标志字段<br>
     * @return 属性标志字段的值
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置属性申报保费调整标志<br>
     * 含义:申报保费调整标志 1：是，0：否<br>
     * @param adjustmentInd 待设置的属性申报保费调整标志的值
     */
    public void setAdjustmentInd(String adjustmentInd) {
        this.adjustmentInd = adjustmentInd;
    }

    /**
     * 获取属性申报保费调整标志<br>
     * 含义:申报保费调整标志 1：是，0：否<br>
     * @return 属性申报保费调整标志的值
     */
    public String getAdjustmentInd() {
        return adjustmentInd;
    }

    /**
     * 设置属性总承保保费<br>
     * @param sumUWPremium 待设置的属性总承保保费的值
     */
    public void setSumUWPremium(Double sumUWPremium) {
        this.sumUWPremium = sumUWPremium;
    }

    /**
     * 获取属性总承保保费<br>
     * @return 属性总承保保费的值
     */
    public Double getSumUWPremium() {
        return sumUWPremium;
    }

    /**
     * 设置属性承保地区描述<br>
     * 含义:▲来源于GGCode.codetype='GeographicalArea' 的代码名称<br>
     * @param geographicalAreaDesc 待设置的属性承保地区描述的值
     */
    public void setGeographicalAreaDesc(String geographicalAreaDesc) {
        this.geographicalAreaDesc = geographicalAreaDesc;
    }

    /**
     * 获取属性承保地区描述<br>
     * 含义:▲来源于GGCode.codetype='GeographicalArea' 的代码名称<br>
     * @return 属性承保地区描述的值
     */
    public String getGeographicalAreaDesc() {
        return geographicalAreaDesc;
    }

    /**
     * 设置属性发现起始日期<br>
     * 含义:发现起始日期<br>
     * @param discoverStartDate 待设置的属性发现起始日期的值
     */
    public void setDiscoverStartDate(Date discoverStartDate) {
        this.discoverStartDate = discoverStartDate;
    }

    /**
     * 获取属性发现起始日期<br>
     * 含义:发现起始日期<br>
     * @return 属性发现起始日期的值
     */
    public Date getDiscoverStartDate() {
        return discoverStartDate;
    }

    /**
     * 设置属性发现中止日期<br>
     * 含义:发现中止日期<br>
     * @param discoverEndDate 待设置的属性发现中止日期的值
     */
    public void setDiscoverEndDate(Date discoverEndDate) {
        this.discoverEndDate = discoverEndDate;
    }

    /**
     * 获取属性发现中止日期<br>
     * 含义:发现中止日期<br>
     * @return 属性发现中止日期的值
     */
    public Date getDiscoverEndDate() {
        return discoverEndDate;
    }

    /**
     * 设置属性索赔方式<br>
     * 含义:0-期内索赔制，1-期内发生制<br>
     * @param compensationType 待设置的属性索赔方式的值
     */
    public void setCompensationType(String compensationType) {
        this.compensationType = compensationType;
    }

    /**
     * 获取属性索赔方式<br>
     * 含义:0-期内索赔制，1-期内发生制<br>
     * @return 属性索赔方式的值
     */
    public String getCompensationType() {
        return compensationType;
    }

    /**
     * 设置属性分单号<br>
     * 含义:分单号<br>
     * @param subProposalNo 待设置的属性分单号的值
     */
    public void setSubProposalNo(String subProposalNo) {
        this.subProposalNo = subProposalNo;
    }

    /**
     * 获取属性分单号<br>
     * 含义:分单号<br>
     * @return 属性分单号的值
     */
    public String getSubProposalNo() {
        return subProposalNo;
    }

    /**
     * 设置属性保险年度天数<br>
     * @param uwYearDays 待设置的属性保险年度天数的值
     */
    public void setUwYearDays(Integer uwYearDays) {
        this.uwYearDays = uwYearDays;
    }

    /**
     * 获取属性保险年度天数<br>
     * @return 属性保险年度天数的值
     */
    public Integer getUwYearDays() {
        return uwYearDays;
    }

    /**
     * 设置属性是否合并录单<br>
     * 含义:是否合并录单,1:是，0:否<br>
     * @param combineInd 待设置的属性是否合并录单的值
     */
    public void setCombineInd(String combineInd) {
        this.combineInd = combineInd;
    }

    /**
     * 获取属性是否合并录单<br>
     * 含义:是否合并录单,1:是，0:否<br>
     * @return 属性是否合并录单的值
     */
    public String getCombineInd() {
        return combineInd;
    }

    /**
     * 设置属性倒签天数<br>
     * 含义:倒签天数<br>
     * @param backDays 待设置的属性倒签天数的值
     */
    public void setBackDays(Long backDays) {
        this.backDays = backDays;
    }

    /**
     * 获取属性倒签天数<br>
     * 含义:倒签天数<br>
     * @return 属性倒签天数的值
     */
    public Long getBackDays() {
        return backDays;
    }

    /**
     * 设置属性延期后保单终保日期<br>
     * 含义:延期后保单终保日期<br>
     * @param delayFinalEndDate 待设置的属性延期后保单终保日期的值
     */
    public void setDelayFinalEndDate(Date delayFinalEndDate) {
        this.delayFinalEndDate = delayFinalEndDate;
    }

    /**
     * 获取属性延期后保单终保日期<br>
     * 含义:延期后保单终保日期<br>
     * @return 属性延期后保单终保日期的值
     */
    public Date getDelayFinalEndDate() {
        return delayFinalEndDate;
    }

    /**
     * 设置属性延期终止日期<br>
     * 含义:延期终止日期<br>
     * @param delayEndDate 待设置的属性延期终止日期的值
     */
    public void setDelayEndDate(Date delayEndDate) {
        this.delayEndDate = delayEndDate;
    }

    /**
     * 获取属性延期终止日期<br>
     * 含义:延期终止日期<br>
     * @return 属性延期终止日期的值
     */
    public Date getDelayEndDate() {
        return delayEndDate;
    }

    /**
     * 设置属性提奖比例<br>
     * 含义:提奖比例<br>
     * @param bonusRate 待设置的属性提奖比例的值
     */
    public void setBonusRate(Double bonusRate) {
        this.bonusRate = bonusRate;
    }

    /**
     * 获取属性提奖比例<br>
     * 含义:提奖比例<br>
     * @return 属性提奖比例的值
     */
    public Double getBonusRate() {
        return bonusRate;
    }

    /**
     * 设置属性参考提奖比例<br>
     * 含义:参考提奖比例<br>
     * @param referBonusRate 待设置的属性参考提奖比例的值
     */
    public void setReferBonusRate(Double referBonusRate) {
        this.referBonusRate = referBonusRate;
    }

    /**
     * 获取属性参考提奖比例<br>
     * 含义:参考提奖比例<br>
     * @return 属性参考提奖比例的值
     */
    public Double getReferBonusRate() {
        return referBonusRate;
    }

    /**
     * 设置属性详细承保地区<br>
     * 含义:详细承保地区<br>
     * @param geographicalAreaDetail 待设置的属性详细承保地区的值
     */
    public void setGeographicalAreaDetail(String geographicalAreaDetail) {
        this.geographicalAreaDetail = geographicalAreaDetail;
    }

    /**
     * 获取属性详细承保地区<br>
     * 含义:详细承保地区<br>
     * @return 属性详细承保地区的值
     */
    public String getGeographicalAreaDetail() {
        return geographicalAreaDetail;
    }

    /**
     * 设置属性延期起始日期<br>
     * 含义:延期起始日期<br>
     * @param delayStartDate 待设置的属性延期起始日期的值
     */
    public void setDelayStartDate(Date delayStartDate) {
        this.delayStartDate = delayStartDate;
    }

    /**
     * 获取属性延期起始日期<br>
     * 含义:延期起始日期<br>
     * @return 属性延期起始日期的值
     */
    public Date getDelayStartDate() {
        return delayStartDate;
    }

    /**
     * 设置属性延期期限(天数)<br>
     * 含义:延期期限(天数)<br>
     * @param delayTime 待设置的属性延期期限(天数)的值
     */
    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * 获取属性延期期限(天数)<br>
     * 含义:延期期限(天数)<br>
     * @return 属性延期期限(天数)的值
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * 设置属性业务分类<br>
     * 含义:业务分类(规则匹配用)<br>
     * @param businessClass 待设置的属性业务分类的值
     */
    public void setBusinessClass(String businessClass) {
        this.businessClass = businessClass;
    }

    /**
     * 获取属性业务分类<br>
     * 含义:业务分类(规则匹配用)<br>
     * @return 属性业务分类的值
     */
    public String getBusinessClass() {
        return businessClass;
    }

    /**
     * 设置属性共保标志<br>
     * 含义:0:非联共保;1:主共保;2:从共保<br>
     * @param coinsInd 待设置的属性共保标志的值
     */
    public void setCoinsInd(String coinsInd) {
        this.coinsInd = coinsInd;
    }

    /**
     * 获取属性共保标志<br>
     * 含义:0:非联共保;1:主共保;2:从共保<br>
     * @return 属性共保标志的值
     */
    public String getCoinsInd() {
        return coinsInd;
    }

    /**
     * 设置属性特殊分保标志<br>
     * 含义:特殊分保标志: 1-是, 0-否<br>
     * @param specialReinsInd 待设置的属性特殊分保标志的值
     */
    public void setSpecialReinsInd(String specialReinsInd) {
        this.specialReinsInd = specialReinsInd;
    }

    /**
     * 获取属性特殊分保标志<br>
     * 含义:特殊分保标志: 1-是, 0-否<br>
     * @return 属性特殊分保标志的值
     */
    public String getSpecialReinsInd() {
        return specialReinsInd;
    }

    /**
     * 设置属性是否重新匹配佣金<br>
     * 含义:是否重新匹配佣金.codeType=YesNoInd  0-否 1-是<br>
     * @param updateCommissionInd 待设置的属性是否重新匹配佣金的值
     */
    public void setUpdateCommissionInd(String updateCommissionInd) {
        this.updateCommissionInd = updateCommissionInd;
    }

    /**
     * 获取属性是否重新匹配佣金<br>
     * 含义:是否重新匹配佣金.codeType=YesNoInd  0-否 1-是<br>
     * @return 属性是否重新匹配佣金的值
     */
    public String getUpdateCommissionInd() {
        return updateCommissionInd;
    }

    /**
     * 设置属性退保标志<br>
     * 含义:退保标志<br>
     * @param surrenderInd 待设置的属性退保标志的值
     */
    public void setSurrenderInd(String surrenderInd) {
        this.surrenderInd = surrenderInd;
    }

    /**
     * 获取属性退保标志<br>
     * 含义:退保标志<br>
     * @return 属性退保标志的值
     */
    public String getSurrenderInd() {
        return surrenderInd;
    }

    /**
     * 设置属性申报说明<br>
     * 含义:申报说明<br>
     * @param declarationExplain 待设置的属性申报说明的值
     */
    public void setDeclarationExplain(String declarationExplain) {
        this.declarationExplain = declarationExplain;
    }

    /**
     * 获取属性申报说明<br>
     * 含义:申报说明<br>
     * @return 属性申报说明的值
     */
    public String getDeclarationExplain() {
        return declarationExplain;
    }

    /**
     * 设置属性险种适用范围<br>
     * 含义:险种适用范围<br>
     * @param riskApplyType 待设置的属性险种适用范围的值
     */
    public void setRiskApplyType(String riskApplyType) {
        this.riskApplyType = riskApplyType;
    }

    /**
     * 获取属性险种适用范围<br>
     * 含义:险种适用范围<br>
     * @return 属性险种适用范围的值
     */
    public String getRiskApplyType() {
        return riskApplyType;
    }

    /**
     * 设置属性产品版本<br>
     * 含义:产品版本<br>
     * @param productEdition 待设置的属性产品版本的值
     */
    public void setProductEdition(String productEdition) {
        this.productEdition = productEdition;
    }

    /**
     * 获取属性产品版本<br>
     * 含义:产品版本<br>
     * @return 属性产品版本的值
     */
    public String getProductEdition() {
        return productEdition;
    }

    /**
     * 设置属性批改保费计算模式<br>
     * @param endorCalculateMode 待设置的属性批改保费计算模式的值
     */
    public void setEndorCalculateMode(String endorCalculateMode) {
        this.endorCalculateMode = endorCalculateMode;
    }

    /**
     * 获取属性批改保费计算模式<br>
     * @return 属性批改保费计算模式的值
     */
    public String getEndorCalculateMode() {
        return endorCalculateMode;
    }

    /**
     * 设置属性即时生效标志<br>
     * @param effectFlag 待设置的属性即时生效标志的值
     */
    public void setEffectFlag(String effectFlag) {
        this.effectFlag = effectFlag;
    }

    /**
     * 获取属性即时生效标志<br>
     * @return 属性即时生效标志的值
     */
    public String getEffectFlag() {
        return effectFlag;
    }

    /**
     * 设置属性分保单号<br>
     * @param subPolicyNo 待设置的属性分保单号的值
     */
    public void setSubPolicyNo(String subPolicyNo) {
        this.subPolicyNo = subPolicyNo;
    }

    /**
     * 获取属性分保单号<br>
     * @return 属性分保单号的值
     */
    public String getSubPolicyNo() {
        return subPolicyNo;
    }

    /**
     * 设置属性涉农标志<br>
     * @param agricultureFlag 待设置的属性涉农标志的值
     */
    public void setAgricultureFlag(String agricultureFlag) {
        this.agricultureFlag = agricultureFlag;
    }

    /**
     * 获取属性涉农标志<br>
     * @return 属性涉农标志的值
     */
    public String getAgricultureFlag() {
        return agricultureFlag;
    }

    /**
     * 设置属性保费计算信息编码<br>
     * @param calculateInfoCode 待设置的属性保费计算信息编码的值
     */
    public void setCalculateInfoCode(String calculateInfoCode) {
        this.calculateInfoCode = calculateInfoCode;
    }

    /**
     * 获取属性保费计算信息编码<br>
     * @return 属性保费计算信息编码的值
     */
    public String getCalculateInfoCode() {
        return calculateInfoCode;
    }

    public String getClauseSysType() {
        return clauseSysType;
    }

    public void setClauseSysType(String clauseSysType) {
        this.clauseSysType = clauseSysType;
    }

    public String getProductSysType() {
        return productSysType;
    }

    public void setProductSysType(String productSysType) {
        this.productSysType = productSysType;
    }

    public String getIsElectronicPolicy() {
        return isElectronicPolicy;
    }

    public void setIsElectronicPolicy(String isElectronicPolicy) {
        this.isElectronicPolicy = isElectronicPolicy;
    }

    /**
     * 比较两个对象在逻辑上是否相等
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuProposalRiskDtoBase)) {
            return false;
        }

        final GuProposalRiskDtoBase otherDto = (GuProposalRiskDtoBase) other;
        if (getProposalNo()!=null && !getProposalNo().equals(otherDto.getProposalNo())) {
            return false;
        }
        if (getPlanCode()!=null && !getPlanCode().equals(otherDto.getPlanCode())) {
            return false;
        }
        if (getRiskCode()!=null && !getRiskCode().equals(otherDto.getRiskCode())) {
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
        buffer.append('|').append(proposalNo);
        buffer.append('|').append(planCode);
        buffer.append('|').append(riskCode);
        return buffer.toString().hashCode();
    }


    public Date getImmEffectStartDate() {
        return immEffectStartDate;
    }


    public void setImmEffectStartDate(Date immEffectStartDate) {
        this.immEffectStartDate = immEffectStartDate;
    }

    /**
     * @return the immEffectType
     */
    public String getImmEffectType() {
        return immEffectType;
    }


    /**
     * @param immEffectType the immEffectType to set
     */
    public void setImmEffectType(String immEffectType) {
        this.immEffectType = immEffectType;
    }


    public String getIsElectronicProposal() {
        return isElectronicProposal;
    }


    public void setIsElectronicProposal(String isElectronicProposal) {
        this.isElectronicProposal = isElectronicProposal;
    }

    /**
     * 理赔绿色通道标识<br>
     * 含义:0-否,1-是<br>
     * @return 理赔绿色通道标识的值
     */
    public String getClaimGreenPassSign() {
        return claimGreenPassSign;
    }

    /**
     * 理赔绿色通道标识<br>
     * 含义:0-否,1-是<br>
     * @return 待设置的理赔绿色通道标识的值
     */
    public void setClaimGreenPassSign(String claimGreenPassSign) {
        this.claimGreenPassSign = claimGreenPassSign;
    }



}

