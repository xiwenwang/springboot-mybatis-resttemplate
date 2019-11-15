package com.aba.pindan.dao.mapper;

import com.aba.pindan.dao.entity.Test;
import com.aba.pindan.dao.entity.TestExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {
    int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}