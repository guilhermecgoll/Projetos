package br.com.crmob.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.crmob.model.Pessoa;

public class PessoaValidation implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Pessoa.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors,  "nomeCompleto", "field.required");
		ValidationUtils.rejectIfEmpty(errors,  "nomeReduzido", "field.required");
	}

	

}
