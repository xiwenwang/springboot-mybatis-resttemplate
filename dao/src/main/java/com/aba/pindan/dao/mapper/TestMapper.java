package com.aba.pindan.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {

    long insert(@Param("name") String name) throws Exception;
}
