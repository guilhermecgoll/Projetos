package br.com.minhasfinancas.modelos;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.minhasfinancas.hibernate.util.BaseBean;

@Entity
@Table(name="lancamento")
public class Lancamento extends BaseBean{

	private static final long serialVersionUID = -4969750827263630978L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	private Double valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_lancamento")
	private Calendar dataLancamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_pagamento")
	private Calendar dataPagamento;
	
	@Column(name="usuario_id")
	private Long usuarioId;
	
	private boolean habilitado;
	
	private String trackingcode;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="criado_em")
	private Calendar criadoEm;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="deletado_em")
	private Calendar deletadoEm;
	
	@ManyToOne
	private Conta conta;

	@ManyToOne
	private Categoria categoria;
	
	public Lancamento() {	
	}

	public Lancamento(Long id, String descricao, Double valor, Calendar dataLancamento, Calendar dataPagamento,
			Long usuarioId, boolean habilitado, String trackingcode, Calendar criadoEm, Calendar deletadoEm,
			Conta conta, Categoria categoria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.dataLancamento = dataLancamento;
		this.dataPagamento = dataPagamento;
		this.usuarioId = usuarioId;
		this.habilitado = habilitado;
		this.trackingcode = trackingcode;
		this.criadoEm = criadoEm;
		this.deletadoEm = deletadoEm;
		this.conta = conta;
		this.categoria = categoria;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public String getTrackingcode() {
		return trackingcode;
	}

	public void setTrackingcode(String trackingcode) {
		this.trackingcode = trackingcode;
	}

	public Calendar getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Calendar criadoEm) {
		this.criadoEm = criadoEm;
	}

	public Calendar getDeletadoEm() {
		return deletadoEm;
	}

	public void setDeletadoEm(Calendar deletadoEm) {
		this.deletadoEm = deletadoEm;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
