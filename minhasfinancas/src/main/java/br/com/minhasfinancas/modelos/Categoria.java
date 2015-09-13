package br.com.minhasfinancas.modelos;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.minhasfinancas.hibernate.util.BaseBean;

@Entity
@Table(name="categoria")
public class Categoria extends BaseBean{
	
	private static final long serialVersionUID = 8339845958077835088L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String titulo;
	
	private String descricao;
	
	private boolean habilitado;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="criado_em")
	private Calendar criadoEm;
	
	public Categoria() {	
	}	

	public Categoria(Long id, String titulo, String descricao, boolean habilitado, Calendar criadoem) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.habilitado = habilitado;
		this.criadoEm = criadoem;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Calendar getCriadoem() {
		return criadoEm;
	}

	public void setCriadoem(Calendar criadoem) {
		this.criadoEm = criadoem;
	}
	
	

}
