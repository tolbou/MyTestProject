package com.example.demo.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/general")
    public String general() {
        return "general";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}