package com.koushik.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "form-page";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "form-view";
	}
	
	@RequestMapping("/capitalize")
	public String capitalize(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "result";
	}
	
	@RequestMapping("/processFormV2")
	public String processFormV2(@RequestParam("email") String email, Model model) {
		model.addAttribute("email", email);
		return "result";
	}
}
