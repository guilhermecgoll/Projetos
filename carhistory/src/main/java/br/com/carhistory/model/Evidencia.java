package br.com.carhistory.model;

import br.com.carhistory.hibernate.util.BaseBean;

public class Evidencia extends BaseBean {
	
	private static final long serialVersionUID = 6088170440066205457L;
	
	private Long id;
	private byte[] bytePicture;
	private TipoEvidencia tipoEvidencia;
	

}
