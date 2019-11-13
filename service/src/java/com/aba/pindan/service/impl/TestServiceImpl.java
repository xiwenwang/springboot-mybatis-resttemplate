package com.aba.pindan.service.impl;

import com.aba.pindan.dao.mapper.TestMapper;
import com.aba.pindan.service.TestService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public long insert(String name) {
        Long insertId = 0L;
        try {
            insertId = testMapper.insert(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return insertId;
    }
}
