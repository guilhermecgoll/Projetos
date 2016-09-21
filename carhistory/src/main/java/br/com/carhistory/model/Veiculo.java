package br.com.carhistory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
public class Veiculo extends BaseBean {
	
	private static final long serialVersionUID = -8836877921087784029L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String placa;
	private String cor;
	private String anoFab;
	private String anoMod;
	private TipoVeiculo tipoVeiculo;
	private Evidencia fotoVeiculo;
	private Evidencia fotoChassi;
	private boolean habilitado;
	
	public Veiculo(){
	}
	
	public Veiculo(String placa, String cor, String anoFab, String anoMod, TipoVeiculo tipoVeiculo,
			Evidencia fotoVeiculo, Evidencia fotoChassi, boolean habilitado) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.anoFab = anoFab;
		this.anoMod = anoMod;
		this.tipoVeiculo = tipoVeiculo;
		this.fotoVeiculo = fotoVeiculo;
		this.fotoChassi = fotoChassi;
		this.habilitado = habilitado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}
	public String getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public Evidencia getFotoVeiculo() {
		return fotoVeiculo;
	}
	public void setFotoVeiculo(Evidencia fotoVeiculo) {
		this.fotoVeiculo = fotoVeiculo;
	}
	public Evidencia getFotoChassi() {
		return fotoChassi;
	}
	public void setFotoChassi(Evidencia fotoChassi) {
		this.fotoChassi = fotoChassi;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	

}
