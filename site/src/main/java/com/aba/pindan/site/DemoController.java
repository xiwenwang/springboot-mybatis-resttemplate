package com.aba.pindan.site;


import com.aba.pindan.iao.weixin.GetAccessTokenClent;
import com.aba.pindan.response.HttpResponse;
import com.aba.pindan.service.TestService;
import com.aba.pindan.service.vo.TestResponse;
import com.aba.pindan.util.ResultParamEnum;
import com.aba.pindan.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DemoController {

    @Value("${elasticseach.host}")
    private String urlPath;

    @Autowired
    private TestService testService;

    @Autowired
    private GetAccessTokenClent accessTokenClent;

    @PostMapping("/test")
    public HttpResponse test(@RequestParam String name) {
        Integer a=0;
        try {
            a = testService.insert(name);
            return ResultUtil.success(a);
        } catch (Exception e) {
            return ResultUtil.error(ResultParamEnum.RESULT_PARAM_ERROR.getCode(), e.getMessage());
        }
    }

    @GetMapping(value = "/getList")
    public HttpResponse getList() {
        try {
            List<TestResponse> result = testService.getList();
            return ResultUtil.success(result);
        } catch (Exception e ) {
            return ResultUtil.error(ResultParamEnum.RESULT_PARAM_ERROR.getCode(), e.getMessage());
        }
    }

    @GetMapping(value = "/getToken")
    public HttpResponse getToken(@RequestParam Integer id) {
        try {
            Object a = accessTokenClent.getAccessToken();
            return ResultUtil.success(a);
        } catch (Exception e) {
            return ResultUtil.error(ResultParamEnum.RESULT_PARAM_ERROR.getCode(), e.getMessage());
        }
    }

}
