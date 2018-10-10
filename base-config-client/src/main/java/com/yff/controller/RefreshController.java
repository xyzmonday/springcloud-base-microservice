package com.yff.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RefreshController {


    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;

    @Value("${hello}")
    String hello;

    @GetMapping("/hello")
    public String hello() {
        return hello;
    }

    @RequestMapping(value = "/foo")
    public String hi(){
        return foo;
    }

    @GetMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "yff") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
