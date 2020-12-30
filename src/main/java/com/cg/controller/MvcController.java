package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

import com.cg.pojo.Student;

@Controller
@RequestMapping("/")
public class MvcController {

	@GetMapping("/register")
	public String AddStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "home";
	}
	
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult) {
		System.out.println(student);
		if(bindingResult.hasErrors()) {
			return "home";
		}
		else {
			return "register_success";
		}
	
	}
}
