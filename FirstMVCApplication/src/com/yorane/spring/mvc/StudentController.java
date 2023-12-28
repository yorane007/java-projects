package com.yorane.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showform")
	public String showForm(Model model){
		Student s = new Student();
		model.addAttribute("student", s);
		return "StudentForm";
	}
	
	@RequestMapping("/processForm")
	public String proccessForm(@ModelAttribute("student") Student theStudent){
		
		return "StudentConfimation";
	}
	
}
