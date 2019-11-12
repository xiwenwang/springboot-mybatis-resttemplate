package com.aba.pindan.site;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${elasticseach.host}")
    private String urlPath;

    @RequestMapping("/test")
    public String test() {
        return "this is test--"+urlPath;
    }
}
