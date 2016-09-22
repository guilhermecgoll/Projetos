package br.com.carhistory.dao;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.carhistory.hibernate.dao.PaisDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Pais;


public class PaisTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PaisTest.class);
	
	private final PaisDAO paisDao = DaoFactory.paisInstance();
	
	@Test
	public void testFindAll() {
		final List<Pais> paises = this.paisDao.findAll();
		LOGGER.info(paises.toString());
	}
	
	@Test
	public void testPersist() throws Exception{
		final Pais pais = new Pais();
		pais.setBacenId(1058L);
		pais.setDescricao("Brasil");
		pais.setSigla("BR");
		paisDao.save(pais);
	}

}
