package com.example.routingandfiltering.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/available")
    public String available() {
        return "Spring In Action";
    }

    @RequestMapping("/check-out")
    public String checkOut() {
        return "Spring Boot In Action";
    }
}
