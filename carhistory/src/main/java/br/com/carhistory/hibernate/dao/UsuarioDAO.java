package br.com.carhistory.hibernate.dao;

import javax.persistence.TypedQuery;

import br.com.carhistory.hibernate.util.GenericDao;
import br.com.carhistory.model.Usuario;

public class UsuarioDAO extends GenericDao<Usuario, Long>{
	
	public Usuario getUserByEmailAndPass(final String user, final String pass) {
		
		final String consulta = "select u from " + Usuario.class.getName() + " u where "
				+ "u.email = :email and u.password = :password";
		
		final TypedQuery<Usuario> query = super.getEntityManager().createQuery(consulta, Usuario.class);
		query.setParameter("email", user);
		query.setParameter("password", pass);
		
		return query.getSingleResult();
	}

}
