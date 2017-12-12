package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Spring Boot!";
    }

}
