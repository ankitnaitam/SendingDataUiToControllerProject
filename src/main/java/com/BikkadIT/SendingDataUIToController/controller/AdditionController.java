package com.BikkadIT.SendingDataUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {

	public AdditionController() {
		System.out.println("Addition Class Constructor...");
	}

	// Sending data UI to Controller using Path Parameter
	@GetMapping("/printValue/{a}") // OR ("/printValue/{a}/additionController")
	public String printValue(@PathVariable int a, Model model) {
		String msg = "The value of a :" + a;
		model.addAttribute("VALUE", msg);

		System.out.println(msg);
		return "print";
	}

	@GetMapping("/addition/{a}/{b}")
	public ModelAndView addition(@PathVariable int a, @PathVariable int b) {
		int c = a + b;
		String add = "The Addition of a & b :" + c;
		ModelAndView mav = new ModelAndView();
		mav.addObject("ADDITION", add);
		mav.setViewName("add");

		System.out.println(mav);
		return mav;
	}

}
