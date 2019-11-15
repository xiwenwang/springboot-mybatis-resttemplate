package com.aba.pindan.service.impl;

import com.aba.pindan.dao.entity.Test;
import com.aba.pindan.dao.mapper.TestMapper;
import com.aba.pindan.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    private final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Resource
    private TestMapper testMapper;

    @Override
    public int insert(String name) throws Exception {
        int insertId = 0;
        try {
            Test record = new Test();
            record.setName(name);
            insertId = testMapper.insert(record);
        } catch (Exception e) {
            LOGGER.error("oops, e="+e.getMessage());
            throw e;
        }
        LOGGER.info("data, id={}",insertId);
        return insertId;
    }
}
