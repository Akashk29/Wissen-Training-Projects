package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController{
	
	
	@RequestMapping(value = "/greet")
	public ModelAndView greeter(@RequestParam String userName) {
		
		System.out.println("processing greet request..");
		String model = "Hello " + userName + " welcome.";
	    ModelAndView mv = new ModelAndView();
	    mv.addObject("message", model);
	    mv.setViewName("greeting");
		return mv;
		
	}
	
	
	
	
}




