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
}
