package br.com.carhistory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="pais")
public class Pais extends BaseBean{
	
	private static final long serialVersionUID = -2666193695449491093L;
	
	@Id
	@Column(name="id")
	private Long bacenId;
	private String descricao;
	private String sigla;
	
	public Pais() {
	}
	
	public Pais(final Long bacenId, final String descricao, final String sigla) {
		super();
		this.bacenId = bacenId;
		this.descricao = descricao;
		this.sigla = sigla;
	}
	public Long getBacenId() {
		return bacenId;
	}
	public void setBacenId(final Long bacenId) {
		this.bacenId = bacenId;
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
	
	
	

}
