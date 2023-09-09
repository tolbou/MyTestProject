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
	//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
}
