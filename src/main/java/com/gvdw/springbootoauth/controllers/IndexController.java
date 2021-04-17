package com.gvdw.springbootoauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created By Gullian on Apr, 2021
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String welcome(Principal principal){
        return "Welcome " +principal.getName()+ ", this is an example of Spring Boot OAuth2";
    }
}
