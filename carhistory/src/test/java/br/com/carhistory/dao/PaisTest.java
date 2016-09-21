package br.com.carhistory.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.carhistory.hibernate.dao.PaisDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Pais;


public class PaisTest {
	
	private static final Logger LOGGER = Logger.getLogger(PaisTest.class);
	
	private PaisDAO paisDao = DaoFactory.paisInstance();
	
	@Test
	public void testFindAll() {
		List<Pais> paises = this.paisDao.findAll();
		LOGGER.info(paises);
	}

}
