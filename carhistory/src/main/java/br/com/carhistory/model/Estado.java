package br.com.carhistory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
public class Estado extends BaseBean{

	private static final long serialVersionUID = -729808767623300945L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private String sigla;
	private Pais pais;
	
	public Estado(){
		
	}
	
	public Estado(Long id, String descricao, String sigla, Pais pais) {
		this.id = id;
		this.descricao = descricao;
		this.sigla = sigla;
		this.pais = pais;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
