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
@Table(name="categoria_usuario")
public class CategoriaUsuario extends BaseBean{

	private static final long serialVersionUID = -535130344884100885L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="criado_em")
	private Calendar criadoEm;
	
	private boolean habilitado;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Usuario usuario;
	
	public CategoriaUsuario() {	
	}

	public CategoriaUsuario(Long id, Calendar criadoEm, boolean habilitado, Categoria categoria, Usuario usuario) {
		super();
		this.id = id;
		this.criadoEm = criadoEm;
		this.habilitado = habilitado;
		this.categoria = categoria;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Calendar criadoEm) {
		this.criadoEm = criadoEm;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
