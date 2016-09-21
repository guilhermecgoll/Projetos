package br.com.carhistory.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="pais")
public class Pais extends BaseBean{
	
	private static final long serialVersionUID = -2666193695449491093L;
	
	@Id
	private Long bacenId;
	private String descricao;
	private String sigla;
	
	public Pais() {
	}
	
	public Pais(Long bacenId, String descricao, String sigla) {
		super();
		this.bacenId = bacenId;
		this.descricao = descricao;
		this.sigla = sigla;
	}
	public Long getBacenId() {
		return bacenId;
	}
	public void setBacenId(Long bacenId) {
		this.bacenId = bacenId;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	

}
