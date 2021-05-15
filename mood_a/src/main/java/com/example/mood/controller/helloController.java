package com.example.mood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class helloController {

    @RequestMapping("/")
    public String sayHello(){
        return "index";

    }
}
