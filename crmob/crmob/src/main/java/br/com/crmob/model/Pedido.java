package br.com.crmob.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Agendamento agendamento;
	private String observacoes;
	private double valorTotal;
	
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Calendar prazoEntrega;
	
	private boolean entregue;
	
	@ElementCollection
	private List<ItemPedido> itens;
}
