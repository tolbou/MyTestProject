package com.example.demo.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {

	@RequestMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("hello", "Hello World");
		return "index";
	}
}
