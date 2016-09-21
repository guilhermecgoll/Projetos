package br.com.carhistory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.carhistory.hibernate.util.BaseBean;

@Entity
@Table (name="evidencia")
public class Evidencia extends BaseBean {
	
	private static final long serialVersionUID = 6088170440066205457L;
	
	@Id
	@GeneratedValue
	private Long id;
	private byte[] bytePicture;
	private TipoEvidencia tipoEvidencia;
	
	public Evidencia(){
		
	}
	
	public Evidencia(Long id, byte[] bytePicture, TipoEvidencia tipoEvidencia) {
		super();
		this.id = id;
		this.bytePicture = bytePicture;
		this.tipoEvidencia = tipoEvidencia;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getBytePicture() {
		return bytePicture;
	}

	public void setBytePicture(byte[] bytePicture) {
		this.bytePicture = bytePicture;
	}

	public TipoEvidencia getTipoEvidencia() {
		return tipoEvidencia;
	}

	public void setTipoEvidencia(TipoEvidencia tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}
}
