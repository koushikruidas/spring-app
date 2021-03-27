package com.koushik.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String confirmationPage(@Valid @ModelAttribute("reservationModel") Reservation res,
			BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "reservation-form";
		} else {
			return "reservation-confirmation";
		}
	}
}
