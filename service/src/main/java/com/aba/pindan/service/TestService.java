package com.aba.pindan.service;

import com.aba.pindan.service.vo.TestResponse;

import java.util.List;

public interface TestService {

    int insert(String name) throws Exception;

    List<TestResponse> getList() throws Exception;
}
