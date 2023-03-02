package com.BikkadIT.SendingDataUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.SendingDataUIToController.model.User;

@Controller
public class UserController {

	public UserController() {
		System.out.println("UserController Class Constructor...");
	}

	@GetMapping("/userInput")
	public String userInput() {
		return "userReg";
	}

	@GetMapping("/saveUser")
	public String saveUser(User user, Model model) {
		System.out.println(user);
		model.addAttribute("REGISTER", user);

		return "userSuccess";
	}

}
