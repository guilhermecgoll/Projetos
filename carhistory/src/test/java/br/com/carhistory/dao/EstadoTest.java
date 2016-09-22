package br.com.carhistory.dao;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.carhistory.hibernate.dao.EstadoDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Estado;


public class EstadoTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EstadoTest.class);
	
	private final EstadoDAO estadoDao = DaoFactory.estadoInstance();
	
	@Test
	public void testFindAll() {
		final List<Estado> estados= this.estadoDao.findAll();
		LOGGER.info(estados.toString());
	}
	
	@Test
	public void testPersist() throws Exception{
		final Estado estado = new Estado();
		estado.setDescricao("Santa Catarina");
		estado.setPais(DaoFactory.paisInstance().findById(1058L));
		estado.setSigla("SC");
		estadoDao.save(estado);
		
	}

}
