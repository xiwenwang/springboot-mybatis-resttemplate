package com.aba.pindan.dao.mapper;

import com.aba.pindan.dao.entity.TAuthMenu;
import com.aba.pindan.dao.entity.TAuthMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthMenuMapper {
    int countByExample(TAuthMenuExample example);

    int deleteByExample(TAuthMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAuthMenu record);

    int insertSelective(TAuthMenu record);

    List<TAuthMenu> selectByExample(TAuthMenuExample example);

    TAuthMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAuthMenu record, @Param("example") TAuthMenuExample example);

    int updateByExample(@Param("record") TAuthMenu record, @Param("example") TAuthMenuExample example);

    int updateByPrimaryKeySelective(TAuthMenu record);

    int updateByPrimaryKey(TAuthMenu record);
}