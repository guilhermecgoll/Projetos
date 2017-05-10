package br.com.crmob.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.crmob.dao.PessoaDAO;
import br.com.crmob.dao.UsuarioService;
import br.com.crmob.exception.CpfCnpjAlreadyInUseException;
import br.com.crmob.exception.UsernameAlreadyInUseException;
import br.com.crmob.model.Pessoa;
import br.com.crmob.model.Usuario;
import br.com.crmob.util.StringUtil;

@Component
public class UsuarioValidation implements Validator {

	private static final String OBRIGATORIO = "field.required";
	
	@Autowired
	private UsuarioService usuarioDao;
	
	@Autowired
	private PessoaDAO pessoaDao;

	@Override
	public boolean supports(Class<?> clazz) {
		return Usuario.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Usuario usuario = (Usuario) target;
		Pessoa pessoa = usuario.getPessoa();

		ValidationUtils.rejectIfEmpty(errors, "username", OBRIGATORIO);
		ValidationUtils.rejectIfEmpty(errors, "password", OBRIGATORIO);
		ValidationUtils.rejectIfEmpty(errors, "pessoa.nomeCompleto", OBRIGATORIO);
		ValidationUtils.rejectIfEmpty(errors, "pessoa.nomeResumido", OBRIGATORIO);
		ValidationUtils.rejectIfEmpty(errors, "pessoa.telefone1", OBRIGATORIO);
		ValidationUtils.rejectIfEmpty(errors, "pessoa.cpfCnpj", OBRIGATORIO);

		try {
			verificaUsuarioJaExistente(usuario);
		} catch (UsernameAlreadyInUseException e) {
			errors.rejectValue("username", "unique.value.already.in.use");
		}
		
		try {
			verificaPessoaJaExistente(pessoa);
		} catch (CpfCnpjAlreadyInUseException e) {
			errors.rejectValue("pessoa.cpfCnpj", "unique.value.already.in.use");
		}
	}

	private void verificaPessoaJaExistente(Pessoa pessoa) {
		String apenasNumeros = StringUtil.getOnlyNumbers(pessoa.getCpfCnpj());
		Pessoa pes = pessoaDao.getPessoaByCpfCnpj(apenasNumeros);
		if (pes != null) {
			throw new CpfCnpjAlreadyInUseException();
		}
		
	}

	private void verificaUsuarioJaExistente(Usuario usuario) {
		Usuario usu = usuarioDao.loadUsuarioByUsername(usuario.getUsername());
		if (usu != null) {
			throw new UsernameAlreadyInUseException();
		}
	}

}
