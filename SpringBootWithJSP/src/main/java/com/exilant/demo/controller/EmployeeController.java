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
import org.springframework.web.bind.annotation.SessionAttributes;

import com.exilant.demo.command.Employee;

@Controller
@SessionAttributes
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
	
	@RequestMapping(value="/showRegister")
	public String showRegister(@ModelAttribute Employee emp,Model model) {
		System.out.println("*********SHOW REGISTER********");
		emp = new Employee();
		emp.setEid(101);
		model.addAttribute("employee",emp);
		return "register";
	}
}
