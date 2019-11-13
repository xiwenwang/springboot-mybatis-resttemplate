package com.aba.pindan.site;

import com.aba.pindan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Value("${elasticseach.host}")
    private String urlPath;

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public Long test() {
        return testService.insert("this is test");
    }
}
