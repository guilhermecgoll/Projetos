package br.com.carhistory.dao;

import java.util.List;

import br.com.carhistory.hibernate.dao.EstadoDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Estado;


public class EstadoTest {
	
	private final EstadoDAO estadoDao = DaoFactory.estadoInstance();
	
	public void testFindAll() {
		final List<Estado> estados= this.estadoDao.findAll();
	}
	
	public void testPersist() throws Exception{
		final Estado estado = new Estado();
		estado.setDescricao("Santa Catarina");
		estado.setPais(DaoFactory.paisInstance().findById(1058L));
		estado.setSigla("SC");
		estadoDao.save(estado);
		
	}

}
