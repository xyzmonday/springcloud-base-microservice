package com.yff.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String service1() {
        return restTemplate.getForObject("http://demo-service2/service2", String.class);
    }


    @GetMapping("/port")
    public String getPort() {
        return "Hello World, I'm from port : " + port;
    }
}
