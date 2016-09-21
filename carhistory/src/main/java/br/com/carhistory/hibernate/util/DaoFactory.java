package br.com.carhistory.hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.carhistory.hibernate.dao.CidadeDAO;
import br.com.carhistory.hibernate.dao.EstadoDAO;
import br.com.carhistory.hibernate.dao.PaisDAO;
import br.com.carhistory.hibernate.dao.UsuarioDAO;
import br.com.carhistory.hibernate.dao.VeiculoDAO;

public final class DaoFactory {
	
	private DaoFactory() {		
	}
	
	private static final String PERSISTENCE_UNIT_NAME = "carHistoryPersistenceUnit";
	
	private static EntityManagerFactory entityManagerFactoryInstance;
	
	public static EntityManagerFactory entityManagerFactoryInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		
		return entityManagerFactoryInstance;
	}
	
	private static PaisDAO paisDaoInstance;
	/**
	 * Instancia o PaisDAO
	 */
	public static PaisDAO paisInstance() {
		if (paisDaoInstance == null) {
			paisDaoInstance = new PaisDAO();
		}
		return paisDaoInstance;
	}
	
	private static EstadoDAO estadoDaoInstance;
	/**
	 * Instancia o EstadoDAO
	 */
	public static EstadoDAO estadoInstance() {
		if (estadoDaoInstance == null) {
			estadoDaoInstance = new EstadoDAO();
		}
		return estadoDaoInstance;
	}
	
	private static CidadeDAO cidadeDaoInstance;
	/**
	 * Instancia o CidadeDAO
	 */
	public static CidadeDAO cidadeInstance(){
		if (cidadeDaoInstance == null) {
			cidadeDaoInstance = new CidadeDAO();
		}
		return cidadeDaoInstance;
	}
	
	private static UsuarioDAO usuarioDaoInstance;
	/**
	 * Instancia o UsuarioDAO
	 */
	public static UsuarioDAO usuarioInstance(){
		if (usuarioDaoInstance == null) {
			usuarioDaoInstance = new UsuarioDAO();
		}
		return usuarioDaoInstance;
	}
	
	private static VeiculoDAO veiculoDaoInstance;
	/**
	 * Instancia o VeiculoDAO
	 */
	public static VeiculoDAO veiculoInstance(){
		if (veiculoDaoInstance == null) {
			veiculoDaoInstance = new VeiculoDAO();
		}
		return veiculoDaoInstance;
	}
}
