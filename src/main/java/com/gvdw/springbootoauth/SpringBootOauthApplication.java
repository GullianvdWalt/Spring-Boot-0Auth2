package com.gvdw.springbootoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * Created By Gullian on Apr, 2021
 */

@SpringBootApplication
@EnableOAuth2Sso
public class SpringBootOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOauthApplication.class, args);
    }

}
