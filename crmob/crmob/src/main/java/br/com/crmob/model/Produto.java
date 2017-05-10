package br.com.crmob.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String codigoFabrica;
	private String descricao;
	private String unidadeMedida;
	private double qtdMinima;
	private double valorUnitario;
	private boolean disponivel;
	public String getCodigoFabrica() {
		return codigoFabrica;
	}
	public void setCodigoFabrica(String codigoFabrica) {
		this.codigoFabrica = codigoFabrica;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public double getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(double qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public long getId() {
		return id;
	}

}
