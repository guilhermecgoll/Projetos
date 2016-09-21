package br.com.casadocodigo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.dao.ProdutoDAO;
import br.com.casadocodigo.models.Produto;
import br.com.casadocodigo.models.TipoPreco;
import br.com.casadocodigo.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	ProdutoDAO produtoDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new ProdutoValidation());
	}

	@RequestMapping("/form")
	public ModelAndView form(){
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(@Valid Produto produto, BindingResult results, RedirectAttributes attributes){
		
		if (results.hasErrors()) {
			return form();
		}
		System.out.println(produto);
		produtoDao.gravar(produto);
		ModelAndView modelAndView = new ModelAndView("redirect:produtos");
		attributes.addFlashAttribute("sucesso","Produto cadastrado com sucesso!");
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
		List<Produto> produtos = produtoDao.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}
}
