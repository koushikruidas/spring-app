package com.koushik.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("/customerRegistration")
	public String registration(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customerRegistrationModel", customer);
		return "customer-form";
	}
	
	@RequestMapping("customerConfirmation")
	public String customerConfirmation(@Valid
			@ModelAttribute("customerRegistrationModel") Customer customer,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirm";
		}
	}
}
