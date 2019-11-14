package com.aba.pindan.service.impl;

import com.aba.pindan.dao.entity.Test;
import com.aba.pindan.dao.mapper.TestMapper;
import com.aba.pindan.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public int insert(String name) {
        int insertId = 0;
        try {
            Test record = new Test();
            record.setName(name);
            insertId = testMapper.insert(record);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return insertId;
    }
}
