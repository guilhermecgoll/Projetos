package br.com.crmob.exception;

public class UsernameAlreadyInUseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsernameAlreadyInUseException() {
		super("Já existe um usuário com o mesmo login/ endereço de e-mail registrado");
	}
	
	public UsernameAlreadyInUseException(String msg) {
		super(msg);
	}
	
	public UsernameAlreadyInUseException(String msg, Throwable t) {
		super(msg, t);
	}
}
