package com.koushik.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {
	@RequestMapping("/reservationForm")
	public String reservationForm(Model model) {
		Reservation res = new Reservation();
		model.addAttribute("reservationModel", res);
		return "reservation-form";
	}
	
	@RequestMapping("/reservationConfirmation")
	public String confirmationPage(@ModelAttribute("reservationModel") Reservation res) {
		return "reservation-confirmation";
	}
}
