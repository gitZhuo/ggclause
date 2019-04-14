package com.zhuo.ggclause.dao;

import com.zhuo.ggclause.dto.GgCheckpointDto;
import javafx.scene.control.Pagination;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  14:53
 * @description
 */
@Component
public class GgRunCheckPointDao {


    public String runCheckpoint(GgCheckpointDto ggCheckpointDto) {


        Map argumentMap = ggCheckpointDto.getArgumentMap();
        String sql = ggCheckpointDto.getSqlstatement();
        String resultCode = "0";

        if (sql.contains(":argument")) {
            sql = sql.replaceAll(":argument", "'" + (String) argumentMap.get("argument") + "'");
        }
        if (sql.contains(":seqNoArgument")) {
            sql = sql.replaceAll(":seqNoArgument", "'" + (Long) argumentMap
                    .get("argumentSeqNo") + "'");
        }
        if (sql.contains(":riskCodeArgument")) {
            sql = sql.replaceAll(":riskCodeArgument", "'" + (String) argumentMap
                    .get("argumentRiskCode") + "'");
        }



        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

        if(list != null && list.size() > 0){
            resultCode = "1";
        }

        return resultCode;

    }
}
