package br.com.carhistory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="veiculo")
public class Veiculo extends BaseBean {
	
	private static final long serialVersionUID = -8836877921087784029L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String placa;
	private String cor;

	@Column(name="ano_fab")
	private String anoFab;
	
	@Column(name="ano_mod")
	private String anoMod;
	
	@Column(name="id_tipo_veiculo")
	private TipoVeiculo tipoVeiculo;
	
	@OneToOne
	@JoinColumn(name="id_foto_veiculo")
	private Evidencia fotoVeiculo;
	
	@OneToOne
	@JoinColumn(name="id_foto_chassi")
	private Evidencia fotoChassi;
	
	private boolean habilitado;
	
	public Veiculo(){
	}
	
	public Veiculo(final String placa, final String cor, final String anoFab, final String anoMod, final TipoVeiculo tipoVeiculo,
			final Evidencia fotoVeiculo, final Evidencia fotoChassi, final boolean habilitado) {
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
	public void setId(final Long id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(final String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(final String cor) {
		this.cor = cor;
	}
	public String getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(final String anoFab) {
		this.anoFab = anoFab;
	}
	public String getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(final String anoMod) {
		this.anoMod = anoMod;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(final TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public Evidencia getFotoVeiculo() {
		return fotoVeiculo;
	}
	public void setFotoVeiculo(final Evidencia fotoVeiculo) {
		this.fotoVeiculo = fotoVeiculo;
	}
	public Evidencia getFotoChassi() {
		return fotoChassi;
	}
	public void setFotoChassi(final Evidencia fotoChassi) {
		this.fotoChassi = fotoChassi;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(final boolean habilitado) {
		this.habilitado = habilitado;
	}
	

}
