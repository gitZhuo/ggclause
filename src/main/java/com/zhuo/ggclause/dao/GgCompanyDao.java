package com.zhuo.ggclause.dao;


import com.zhuo.ggclause.dto.GgCompanyDto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhuoshengqi
 * @date 2019/03/13  10:28
 * @description
 */
public interface GgCompanyDao extends JpaRepository<GgCompanyDto,String> {
}
