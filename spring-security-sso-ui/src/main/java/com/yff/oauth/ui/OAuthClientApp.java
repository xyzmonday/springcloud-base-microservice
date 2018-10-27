package com.yff.oauth.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://github.com/eugenp/tutorials/tree/master/spring-security-sso
@SpringBootApplication
public class OAuthClientApp {

    public static void main(String[] args) {
        SpringApplication.run(OAuthClientApp.class,args);
    }
}
