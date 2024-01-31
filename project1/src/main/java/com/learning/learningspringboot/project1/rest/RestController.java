package com.learning.learningspringboot.project1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }
}
