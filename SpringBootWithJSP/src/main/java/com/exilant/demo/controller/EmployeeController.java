package com.exilant.demo.controller;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.exilant.demo.service.EmployeeService;
import com.exilant.demo.to.EmployeeTO;

@Controller
@SessionAttributes
public class EmployeeController {

	@Autowired
	EmployeeService empser;

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
	public String showRegister(@ModelAttribute EmployeeTO eto,Model model) {
		System.out.println("*********SHOW REGISTER********");
		eto = new EmployeeTO();
		eto.setEid(101);
		model.addAttribute("employee",eto);
		return "register";
	}
	
	@RequestMapping(value="/addEmployee")
	public String addEmployee(@ModelAttribute EmployeeTO eto) {
		System.out.println("Adding New Employee...");	
		empser.addEmployee(eto);
		System.out.println("Employee Added Successfully.....");
		return "index";	
	}
}
