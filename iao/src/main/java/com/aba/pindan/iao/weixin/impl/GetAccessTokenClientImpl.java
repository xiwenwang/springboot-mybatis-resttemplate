package com.aba.pindan.iao.weixin.impl;

import com.aba.pindan.iao.weixin.GetAccessTokenClent;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetAccessTokenClientImpl implements GetAccessTokenClent {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetAccessTokenClientImpl.class);

    /**
     * 获取access_token
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object getAccessToken() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String  aa = restTemplate.getForObject("https://www.baidu.com", String.class);
        Object b = JSON.toJavaObject(JSON.parseObject(aa), Object.class);
        LOGGER.info("aa={}", aa);
        return aa;
    }
}
