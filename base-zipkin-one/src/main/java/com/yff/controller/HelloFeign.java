package com.yff.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author monday
 */
@Component
@FeignClient(value = "zipkin-client-two")
public interface HelloFeign {
    @GetMapping("/hi")
    String sayHi();
}
