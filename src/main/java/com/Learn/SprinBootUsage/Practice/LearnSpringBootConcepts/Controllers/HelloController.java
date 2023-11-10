package com.Learn.SprinBootUsage.Practice.LearnSpringBootConcepts.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello, World";
    }
}
