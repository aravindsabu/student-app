package com.nestdigital.studentApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/")
    public String Homepage()
    {
        return "welcome to my home page";
    }
    @GetMapping("/contact")
    public String Contactpage()
    {
        return "this is my contact page";
    }
}
