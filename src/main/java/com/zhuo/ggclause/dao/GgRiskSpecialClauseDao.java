package com.zhuo.ggclause.dao;

import com.zhuo.ggclause.dto.GgCheckpointDto;
import com.zhuo.ggclause.dto.GgRiskSpecialClauseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  9:32
 * @description
 */
public interface GgRiskSpecialClauseDao extends JpaRepository<GgRiskSpecialClauseDto, Long>, JpaSpecificationExecutor<GgRiskSpecialClauseDto> {

    List findAllByRiskCodeAndCompanyCodeAndModifyIndAndValidInd(String riskCode, String companyCode, String s, String s1);

    String runCheckpoint(GgCheckpointDto ggCheckpointDto);
}
