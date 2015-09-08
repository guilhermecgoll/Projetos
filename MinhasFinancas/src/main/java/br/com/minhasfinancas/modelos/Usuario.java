package br.com.minhasfinancas.modelos;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String username;
	private String email;
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar ultimoLogin;
	
	private boolean habilitado;
	
	
}
