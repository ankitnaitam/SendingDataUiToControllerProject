package com.BikkadIT.SendingDataUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	public GreetController() {
		System.out.println("Greet Class Constructor...");
	}

	@GetMapping("/greetURL")
	public String greetMsg(@RequestParam String name, Model model) {
		String msg = "Hii " + name + " Congrats! You got admission in BikkadIT";
		model.addAttribute("GREET", msg);
		
		System.out.println(msg);
		return "greet";
	}

}
