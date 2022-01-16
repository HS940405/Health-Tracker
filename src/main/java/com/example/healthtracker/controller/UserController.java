package com.example.healthtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login_page";
    }

}



//https://youtu.be/x_nfnVU0wAI -> Check other process later -