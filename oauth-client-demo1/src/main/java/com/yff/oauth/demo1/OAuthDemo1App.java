package com.yff.oauth.demo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableOAuth2Client
@SpringBootApplication
public class OAuthDemo1App {

    public static void main(String[] args) {
        SpringApplication.run(OAuthDemo1App.class, args);
    }

    @Autowired
    private OAuth2ClientContext oauth2ClientContext;

    @Bean
    public OAuth2RestTemplate restTemplate() {
        return new OAuth2RestTemplate(new AuthorizationCodeResourceDetails(), oauth2ClientContext);
    }
}
