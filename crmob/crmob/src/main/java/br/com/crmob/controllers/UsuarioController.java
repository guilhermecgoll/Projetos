package br.com.crmob.controllers;

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

import br.com.crmob.dao.PessoaDAO;
import br.com.crmob.dao.UsuarioDAO;
import br.com.crmob.model.Role;
import br.com.crmob.model.TipoRole;
import br.com.crmob.model.Usuario;
import br.com.crmob.util.SecurityUtil;
import br.com.crmob.util.StringUtil;
import br.com.crmob.validation.UsuarioValidation;

@Controller
@RequestMapping("/cadastro")
public class UsuarioController {

	@Autowired
	private PessoaDAO pessoaDao;
	
	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Autowired
	private UsuarioValidation usuarioValidation;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(usuarioValidation);
	}
	
	@RequestMapping("/usuarios/form")
	public ModelAndView form(Usuario usuario) {
		ModelAndView modelAndView = new ModelAndView("usuarios/form");
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView gravar(@Valid Usuario usuario, BindingResult result, RedirectAttributes redAttributes) {
		
		if (result.hasErrors()) {
			return form(usuario);
		}
		//Mantém apenas dígitos
		usuario.getPessoa().setCpfCnpj(StringUtil.getOnlyNumbers(usuario.getPessoa().getCpfCnpj()));
		usuario.getPessoa().setAtivo(true);
		usuario.setPassword(SecurityUtil.encode(usuario.getPassword()));
		usuario.addAuthority(new Role(TipoRole.EXTERNAL));
		
		pessoaDao.gravar(usuario.getPessoa());		
		usuarioDao.gravar(usuario);
		
		redAttributes.addFlashAttribute("resultado", "Usuário cadastrado com sucesso!");

		return new ModelAndView("redirect:/");
	}

}
