package br.com.crmob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.crmob.dao.PessoaDAO;
import br.com.crmob.model.Pessoa;
import br.com.crmob.validation.PessoaValidation;

@Controller
@RequestMapping("/cadastrosss")
public class CadastroController {

	@Autowired
	private PessoaDAO pessoaDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new PessoaValidation());
	}
	
	@RequestMapping("/pessoas/form")
	public ModelAndView form(Pessoa pessoa) {
		ModelAndView modelAndView = new ModelAndView("pessoas/form");
		return modelAndView;
	}

	@RequestMapping("/pessoas")
	public ModelAndView index() {
		List<Pessoa> pessoas = pessoaDao.listar();
		ModelAndView modelAndView = new ModelAndView("pessoas/form");
		modelAndView.addObject("pessoas", pessoas);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView gravar(Pessoa pessoa, BindingResult result, RedirectAttributes redAttributes) {
		pessoaDao.gravar(pessoa);
		redAttributes.addFlashAttribute("sucesso", "Pessoa cadastrada com sucesso!");

		return new ModelAndView("redirect:login");
	}

}
