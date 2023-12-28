package com.yorane.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorld {
	@RequestMapping("/showform")
	public String showForm() {
		return "HelloWorld";
	}
	@RequestMapping("/processform")
	public String processForm() {
		return "HelloWorldResponse";
	}
	@RequestMapping("/processformV1")
	public String processFormV1(HttpServletRequest req,Model model) {
		String res = req.getParameter("firstName");
		res = "Hi! " + res.toUpperCase();
		model.addAttribute("message", res);
		return "HelloWorldResponse";
				
	}
	
	@RequestMapping("/processformV2")
	public String processFormV2(@RequestParam("firstName")String fname,Model model) {
		String res = "Hello! " + fname.toUpperCase();
		model.addAttribute("message", res);
		return "HelloWorldResponse";
				
	}

}
