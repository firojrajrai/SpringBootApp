package com.exilant.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exilant.demo.command.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/verify")
	public String verifyUser(@RequestParam("name") String name,@RequestParam("pass") String pass,Model model) {
	if(name.equals(pass)) {
	model.addAttribute("name",name);
	model.addAttribute("pass",pass);
	return "emphome";
		}
	else {
			model.addAttribute("error","Invalid User Name or Password");
			return "index";
	}
	}
	
	@RequestMapping(value="/showRegister",method=RequestMethod.GET)
	public String showRegister(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "register";
	}
}
