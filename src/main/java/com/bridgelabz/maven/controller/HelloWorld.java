package com.bridgelabz.maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/message")
    public String printMessage() {
        return "Hello World";
    }

}
