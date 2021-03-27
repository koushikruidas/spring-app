package com.koushik.spring;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	// Below initBinder method will pre-process every String form data
	// Remove leading and trailling whitespaces
	// in the constructor used 'true' as an argument that means if the String has
	// only white space it will trim it to Null.

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		// true means it will trim it to null if only white space available
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/customerRegistration")
	public String registration(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customerRegistrationModel", customer);
		return "customer-form";
	}

	@RequestMapping("customerConfirmation")
	public String customerConfirmation(@Valid @ModelAttribute("customerRegistrationModel") Customer customer,
			BindingResult theBindingResult) {
		System.out.println("First name of the customer: |"+customer.getfirstName()+"|");
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirm";
		}
	}
}
