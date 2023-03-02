package com.BikkadIT.SendingDataUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("Welcome Class Controller...");
	}

	@GetMapping("/welcomeURL")
	public String welcomeMsg(@RequestParam String name) {
		String msg = "Hii " + name + " welcome to BikkadIT";
		System.out.println(msg);

		return "welcome";
	}

}
