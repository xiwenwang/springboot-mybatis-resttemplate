package com.aba.pindan.site;


import com.aba.pindan.response.HttpResponse;
import com.aba.pindan.service.TestService;
import com.aba.pindan.util.ResultParamEnum;
import com.aba.pindan.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Value("${elasticseach.host}")
    private String urlPath;

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public HttpResponse test(@RequestParam String name) {
        Integer a = 0;
        try {
            a = testService.insert(name);
            return ResultUtil.success(a);
        } catch (Exception e) {
            return ResultUtil.error(ResultParamEnum.RESULT_PARAM_ERROR.getCode(), e.getMessage());
        }
    }
}
