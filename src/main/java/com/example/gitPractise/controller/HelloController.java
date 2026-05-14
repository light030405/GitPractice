package com.example.gitPractise.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(){
        return "Hiii.. User";
    }

    @GetMapping("/msg")
    public String getMessage(){
        return "Hello.. This is awesome";
    }
}
