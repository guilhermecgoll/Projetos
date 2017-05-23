package br.com.carhistory.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="usuario")
public class Usuario extends BaseBean{

	private static final long serialVersionUID = -3636484281968437045L;

	@Id
	@GeneratedValue
	@NotNull
	private Long id;
	
	private String nome;
	private String sobrenome;
	@Column(unique = true)
	private String email;
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ultimo_login")
	private Calendar ultimoLogin;
	
	private boolean habilitado;
	
	@ManyToOne
	@JoinColumn(name="id_cidade")
	private Cidade cidadeUsuario;
	
	@Column(name = "cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name = "doc_identifier")
	private String docIdentifier;
	
	public Usuario() {		
	}	

	public Usuario(final Long id, final String nome, final String sobrenome, final String email, final String password, final Calendar ultimoLogin,
			final boolean habilitado, final Cidade cidade, final String cpfCnpj, final String docIdentifier) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
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

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public Calendar getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(final Calendar ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(final boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(final String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Cidade getCidadeUsuario() {
		return cidadeUsuario;
	}

	public void setCidadeUsuario(final Cidade cidadeUsuario) {
		this.cidadeUsuario = cidadeUsuario;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(final String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getDocIdentifier() {
		return docIdentifier;
	}

	public void setDocIdentifier(final String docIdentifier) {
		this.docIdentifier = docIdentifier;
	}
	
}
