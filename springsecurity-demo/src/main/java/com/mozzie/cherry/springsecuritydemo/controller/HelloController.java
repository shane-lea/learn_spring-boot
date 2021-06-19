package com.mozzie.cherry.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: manji
 * @data: 2021/6/19
 */
@RestController
@RequestMapping("/v1")
public class HelloController {

    @GetMapping("/test")
    public String test(){
        return "欢迎来到 spring-security";
    }
}
