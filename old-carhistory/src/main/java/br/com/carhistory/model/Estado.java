package br.com.carhistory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="estado")
public class Estado extends BaseBean{

	private static final long serialVersionUID = -729808767623300945L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	@NotNull
	private String sigla;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name = "id_pais")
	private Pais pais;
	
	public Estado(){
		
	}
	
	public Estado(final Long id, final String descricao, final String sigla, final Pais pais) {
		this.id = id;
		this.descricao = descricao;
		this.sigla = sigla;
		this.pais = pais;
	}


	public Long getId() {
		return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(final String sigla) {
		this.sigla = sigla;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(final Pais pais) {
		this.pais = pais;
	}

}
