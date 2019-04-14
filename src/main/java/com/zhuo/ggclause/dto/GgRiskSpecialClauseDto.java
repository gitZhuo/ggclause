package com.zhuo.ggclause.dto;

import com.zhuo.ggclause.dto.base.GgRiskSpecialClauseDtoBase;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  9:30
 * @description
 */

public class GgRiskSpecialClauseDto extends GgRiskSpecialClauseDtoBase implements Serializable {


    private String riskName = null;

    private String clauseName= null;

    private String content = null;

    private String creatorName = null;

    private String updaterName = null;

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public String getClauseName() {
        return clauseName;
    }

    public void setClauseName(String clauseName) {
        this.clauseName = clauseName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }
}
