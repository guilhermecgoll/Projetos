package br.com.crmob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class MyCustomersController {
	
	@RequestMapping("/index")
	public ModelAndView dashboard(){
		return new ModelAndView("customers/index");
	}

}
