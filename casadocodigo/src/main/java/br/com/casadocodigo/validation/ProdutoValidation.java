package br.com.casadocodigo.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.models.Produto;

public class ProdutoValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
		Produto produto = (Produto) arg0;
		if (produto.getPaginas() <= 0) {
			errors.reject("paginas", "field.required");
		}
		
	}
}
