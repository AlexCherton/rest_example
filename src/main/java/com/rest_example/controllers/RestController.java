package com.rest_example.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    @GetMapping("/Hello")
    @ResponseBody
    public String hello(){
        return "Hello";
    }

}
