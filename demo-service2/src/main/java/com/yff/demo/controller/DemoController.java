package com.yff.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "service2")
    public String service2() {
        return "Hi,I'm Service2!";
    }
}
