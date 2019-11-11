package com.aba.pindan.site;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/")
    public String test() {
        return "this is test 哈哈";
    }
}
