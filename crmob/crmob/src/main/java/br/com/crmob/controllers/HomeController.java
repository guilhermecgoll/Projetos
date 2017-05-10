package br.com.crmob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.crmob.dao.PessoaDAO;
import br.com.crmob.model.Pessoa;

@Controller
public class HomeController {
	
	@Autowired
	private PessoaDAO pessoaDao;

	@RequestMapping(value={"/", "/home"})
	@Cacheable(value="pessoasHome")
	public ModelAndView index(){
		List<Pessoa> pessoas = pessoaDao.listar();
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("pessoas", pessoas);
		return modelAndView;
	}
	
}
