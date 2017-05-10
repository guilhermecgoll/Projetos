package br.com.crmob.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Agendamento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Pessoa vendedor;
	
	@ManyToOne
	private Pessoa cliente;
	
	@DateTimeFormat
	private Calendar dataProgramada;
	@DateTimeFormat
	private Calendar dataRealizada;
	
	private TipoAgendamento tipo;
	
	private boolean realizada;
	
	private String observacoes;

	public Pessoa getVendedor() {
		return vendedor;
	}

	public void setVendedor(Pessoa vendedor) {
		this.vendedor = vendedor;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Calendar getDataProgramada() {
		return dataProgramada;
	}

	public void setDataProgramada(Calendar dataProgramada) {
		this.dataProgramada = dataProgramada;
	}

	public Calendar getDataRealizada() {
		return dataRealizada;
	}

	public void setDataRealizada(Calendar dataRealizada) {
		this.dataRealizada = dataRealizada;
	}

	public TipoAgendamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoAgendamento tipo) {
		this.tipo = tipo;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public long getId() {
		return id;
	}
	
}
