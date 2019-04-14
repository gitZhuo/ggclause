package com.zhuo.ggclause.dto;

import com.zhuo.ggclause.dto.base.GgCompanyDtoBase;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  9:29
 * @description
 */
@Entity
public class GgCompanyDto extends GgCompanyDtoBase implements Serializable {
    private String companyShowName = null;
    private String addressShowName = null;
    private String insurerShowName = null;
    private String accChannelName = null;

    public String getCompanyShowName() {
        return companyShowName;
    }

    public void setCompanyShowName(String companyShowName) {
        this.companyShowName = companyShowName;
    }

    public String getAddressShowName() {
        return addressShowName;
    }

    public void setAddressShowName(String addressShowName) {
        this.addressShowName = addressShowName;
    }

    public String getInsurerShowName() {
        return insurerShowName;
    }

    public void setInsurerShowName(String insurerShowName) {
        this.insurerShowName = insurerShowName;
    }

    public String getAccChannelName() {
        return accChannelName;
    }

    public void setAccChannelName(String accChannelName) {
        this.accChannelName = accChannelName;
    }
}
