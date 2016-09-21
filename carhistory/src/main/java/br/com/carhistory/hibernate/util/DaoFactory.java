package br.com.carhistory.hibernate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.carhistory.hibernate.dao.CidadeDAO;
import br.com.carhistory.hibernate.dao.EstadoDAO;
import br.com.carhistory.hibernate.dao.PaisDAO;

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
	
	/**
	 * Instancia o PaisDAO
	 */
	private static PaisDAO paisDaoInstance;
	
	public static PaisDAO paisInstance() {
		if (paisDaoInstance == null) {
			paisDaoInstance = new PaisDAO();
		}
		return paisDaoInstance;
	}
	
	private static EstadoDAO estadoDaoInstance;
	
	public static EstadoDAO estadoInstance() {
		if (estadoDaoInstance == null) {
			estadoDaoInstance = new EstadoDAO();
		}
		return estadoDaoInstance;
	}
	
	private static CidadeDAO cidadeDaoInstance;
	
	public static CidadeDAO cidadeInstance(){
		if (cidadeDaoInstance == null) {
			cidadeDaoInstance = new CidadeDAO();
		}
		return cidadeDaoInstance;
	}
}
