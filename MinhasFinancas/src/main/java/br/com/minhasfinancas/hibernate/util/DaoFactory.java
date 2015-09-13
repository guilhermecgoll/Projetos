package br.com.minhasfinancas.hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.minhasfinancas.hibernate.dao.UsuarioDAO;

public final class DaoFactory {
	
	private DaoFactory() {		
	}
	
	private static final String PERSISTENCE_UNIT_NAME = "minhasFinancasPersistenceUnit";
	
	private static EntityManagerFactory entityManagerFactoryInstance;
	
	public static EntityManagerFactory entityManagerFactoryInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		
		return entityManagerFactoryInstance;
	}
	
	/*
	 * Instancia o UsuarioDAO
	 */
	
	private static UsuarioDAO usuarioDaoInstance;
	
	public static UsuarioDAO usuarioInstance() {
		if (usuarioDaoInstance == null) {
			usuarioDaoInstance = new UsuarioDAO();
		}
		return usuarioDaoInstance;
	}
	
	

}
