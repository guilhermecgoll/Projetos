package br.com.crmob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
	
	@RequestMapping("/sobre-nos")
	public String sobreNos(){
		return "info/sobre-nos";
	}
	
	@RequestMapping("/para-voce")
	public String paraVoce(){
		return "info/para-voce";
	}
	
	@RequestMapping("/para-empresas")
	public String paraEmpresa(){
		return "info/para-empresas";
	}

}
