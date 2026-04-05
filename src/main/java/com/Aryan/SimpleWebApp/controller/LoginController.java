package com.Aryan.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // to link the webpage with the spring boot
public class LoginController
{
    @RequestMapping("/")
    public String greeting()
    {
        return "Greetings from Spring Boot!";


    }


    @RequestMapping("/teach")
    public   String teacher()
    {
        return "we dont teach , we educate";

    }


}
