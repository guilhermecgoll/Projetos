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
	
	public Evidencia(final Long id, final byte[] bytePicture, final TipoEvidencia tipoEvidencia) {
		super();
		this.id = id;
		this.bytePicture = bytePicture;
		this.tipoEvidencia = tipoEvidencia;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public byte[] getBytePicture() {
		return bytePicture;
	}

	public void setBytePicture(final byte[] bytePicture) {
		this.bytePicture = bytePicture;
	}

	public TipoEvidencia getTipoEvidencia() {
		return tipoEvidencia;
	}

	public void setTipoEvidencia(final TipoEvidencia tipoEvidencia) {
		this.tipoEvidencia = tipoEvidencia;
	}
}
