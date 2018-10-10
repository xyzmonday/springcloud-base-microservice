package com.yff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 参考:
 * https://codeload.github.com/hackyoMa/spring-cloud-demo/zip/master
 * https://www.jianshu.com/p/4b9bf5a311fe
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ZipkinClientOneApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientOneApplication.class,args);
    }
}
