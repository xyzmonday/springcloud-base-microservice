package com.yff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableTurbine
public class ServiceTurbineApplication {

    /**
     * 打开仪表盘
     * http://localhost:8891/hystrix
     * 监控数据
     * http://localhost:8891/turbine.stream（注意这里路径不能有/actuator）
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceTurbineApplication.class, args);
    }
}