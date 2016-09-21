package br.com.carhistory.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="usuario")
public class Usuario extends BaseBean{

	private static final long serialVersionUID = -3636484281968437045L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String sobrenome;
	private String username;
	private String email;
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ultimo_login")
	private Calendar ultimoLogin;
	
	private boolean habilitado;
	private Cidade cidadeUsuario;
	private String cpfCnpj;
	private String docIdentifier;
	
	public Usuario() {		
	}	

	public Usuario(Long id, String nome, String sobrenome, String username, String email, String password, Calendar ultimoLogin,
			boolean habilitado, Cidade cidade, String cpfCnpj, String docIdentifier) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.username = username;
		this.email = email;
		this.password = password;
		this.ultimoLogin = ultimoLogin;
		this.habilitado = habilitado;
		this.cidadeUsuario = cidade;
		this.cpfCnpj = cpfCnpj;
		this.docIdentifier = docIdentifier;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(Calendar ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Cidade getCidadeUsuario() {
		return cidadeUsuario;
	}

	public void setCidadeUsuario(Cidade cidadeUsuario) {
		this.cidadeUsuario = cidadeUsuario;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getDocIdentifier() {
		return docIdentifier;
	}

	public void setDocIdentifier(String docIdentifier) {
		this.docIdentifier = docIdentifier;
	}
	
}