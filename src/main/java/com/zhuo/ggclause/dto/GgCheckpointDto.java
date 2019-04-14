package com.zhuo.ggclause.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Map;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  13:46
 * @description
 */
@Entity
@Table(name = "GgCheckpoint")
public class GgCheckpointDto {

    @Id
    private String description = null;

    private String sqlstatement = null;

    private Map argumentMap = null;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSqlstatement() {
        return sqlstatement;
    }

    public void setSqlstatement(String sqlstatement) {
        this.sqlstatement = sqlstatement;
    }

    public Map getArgumentMap() {
        return argumentMap;
    }

    public void setArgumentMap(Map argumentMap) {
        this.argumentMap = argumentMap;
    }
}
