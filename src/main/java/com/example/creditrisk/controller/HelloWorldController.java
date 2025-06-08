package com.example.creditrisk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
     @GetMapping("/")
    public String hello() {
        return "Credit Risk Engine API is running!";
    }
}
