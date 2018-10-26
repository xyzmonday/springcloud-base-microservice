package com.yff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 这是Eureka进入了保护模式，不会马上把不可用的服务剔除掉，默认的心跳时间比较长，开发环境下，我们想快速踢出不可用服务时，如何做？很简单，把自我保护功能设置为false：
 * server 端设置
 * <p>
 * eureka.server.enable-self-preservation=false
 * #Make sure eureka server can detect whether this app is up or down
 * eureka.instance.lease-renewal-interval-in-seconds=5
 * eureka.instance.lease-expiration-duration-in-seconds=5
 * <p>
 * client端设置
 * <p>
 * #Make sure eureka server can detect whether this app is up or down
 * eureka.instance.lease-renewal-interval-in-seconds=5
 * eureka.instance.lease-expiration-duration-in-seconds=5
 * 这样会报：
 * <p>
 * THE SELF PRESERVATION MODE IS TURNED OFF.THIS MAY NOT PROTECT INSTANCE EXPIRY IN CASE OF NETWORK/OTHER PROBLEMS.
 * ---------------------
 * 原文：https://blog.csdn.net/w1054993544/article/details/78086840?utm_source=copy
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
