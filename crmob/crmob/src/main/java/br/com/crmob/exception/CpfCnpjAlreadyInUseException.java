package br.com.crmob.exception;

public class CpfCnpjAlreadyInUseException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CpfCnpjAlreadyInUseException() {
		super("Já existe uma pessoa com o mesmo Cpf/ Cnpj registrada!");
	}
	
	public CpfCnpjAlreadyInUseException(String msg) {
		super(msg);
	}
	
	public CpfCnpjAlreadyInUseException(String msg, Throwable t){
		super(msg, t);
	}

}
