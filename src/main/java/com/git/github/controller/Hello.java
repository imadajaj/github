package com.git.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello imad how are you? checking if the changes are working or not";
    }
    
}
