package br.com.crmob.controllers;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value={"/", "/home"})
	@Cacheable(value="pessoasHome")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
	
}
