package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(@RequestParam(value = "name",
            defaultValue = "программист Java Spring")
                            String name) {
        return String.format("Привет, %s!", name);
    }
}
