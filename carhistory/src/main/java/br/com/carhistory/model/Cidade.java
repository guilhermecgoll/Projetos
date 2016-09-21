package br.com.carhistory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
public class Cidade extends BaseBean{

	private static final long serialVersionUID = 1360858791426671527L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	
	private Estado estado;
	
	public Cidade(){
		
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
