package br.com.crmob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class MyProductsController {

	@RequestMapping("/index")
	public String index(){
		return "products/index";
	}
}
