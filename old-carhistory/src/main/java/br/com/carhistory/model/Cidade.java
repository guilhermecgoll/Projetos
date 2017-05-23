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
@Table (name="cidade")
public class Cidade extends BaseBean{

	private static final long serialVersionUID = 1360858791426671527L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="id_estado")
	private Estado estado;
	
	public Cidade(){
		
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(final Estado estado) {
		this.estado = estado;
	}
	
}
