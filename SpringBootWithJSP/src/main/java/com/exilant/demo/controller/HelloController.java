package com.exilant.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String verifyUser(@RequestParam("name") String name,@RequestParam("pass") String pass,Model model) {
	if(name.equals(pass)) {
	model.addAttribute("name",name);
	model.addAttribute("pass",pass);
	return "hello";
		}
	else {
			model.addAttribute("error","Invalid User Name or Password");
			return "index";
	}
	}
}
