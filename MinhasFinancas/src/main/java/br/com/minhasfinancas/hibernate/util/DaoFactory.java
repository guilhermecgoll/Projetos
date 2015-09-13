package br.com.minhasfinancas.hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.minhasfinancas.hibernate.dao.CategoriaDAO;
import br.com.minhasfinancas.hibernate.dao.CategoriaUsuarioDAO;
import br.com.minhasfinancas.hibernate.dao.ContaDAO;
import br.com.minhasfinancas.hibernate.dao.LancamentoDAO;
import br.com.minhasfinancas.hibernate.dao.UsuarioDAO;
import br.com.minhasfinancas.modelos.CategoriaUsuario;

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
	
	/*
	 * Instancia o CategoriaDAO
	 */
	private static CategoriaDAO categoriaDaoInstance;
	
	public static CategoriaDAO categoriaInstance() {
		if (categoriaDaoInstance == null) {
			categoriaDaoInstance = new CategoriaDAO();
		}
		return categoriaDaoInstance;
	}
	
	/*
	 * Instancia o ContaDAO
	 */
	private static ContaDAO contaDaoInstance;
	
	public static ContaDAO contaInstance(){
		if (contaDaoInstance == null) {
			contaDaoInstance = new ContaDAO();
		}
		return contaDaoInstance;
	}
	
	/*
	 * Instancia o LancamentoDAO
	 */
	private static LancamentoDAO lancamentoDaoInstance;
	
	public static LancamentoDAO lancamentoInstance() {
		if (lancamentoDaoInstance == null) {
			lancamentoDaoInstance = new LancamentoDAO();
		}
		return lancamentoDaoInstance;
	}
	
	/*
	 * Instancia o CategoriaUsuarioDAO
	 */
	private static CategoriaUsuarioDAO categoriaUsuarioDaoInstance;
	
	public static CategoriaUsuarioDAO categoriaUsuarioInstance() {
		if (categoriaUsuarioDaoInstance == null) {
			categoriaUsuarioDaoInstance = new CategoriaUsuarioDAO();
		}
		return categoriaUsuarioDaoInstance;
	}
}
