package com.BikkadIT.SendingDataUIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

	public CourseController() {
		System.out.println("Course Class Constructor...");
	}

	@GetMapping("/courseURL")
	public ModelAndView courseData(@RequestParam int cId, @RequestParam String cName, @RequestParam double cFees) {
		String msg=cId+" "+cName+" course has fees :"+cFees;
		ModelAndView mav=new ModelAndView();
		mav.addObject("COURSE", msg);
		mav.setViewName("course");
		
		System.out.println(msg);
		return mav;	
	}
	
}
