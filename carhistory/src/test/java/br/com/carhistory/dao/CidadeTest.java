package br.com.carhistory.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.carhistory.hibernate.dao.CidadeDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Cidade;

public class CidadeTest {
	
	private static final Logger LOGGER = Logger.getLogger(CidadeTest.class);
	
	private final CidadeDAO cidadeDao = DaoFactory.cidadeInstance();
	
	@Test
	public void testFindAll() {
		final List<Cidade> estados= this.cidadeDao.findAll();
		LOGGER.info(estados.toString());
	}
	
	@Test
	public void testPersist() throws Exception{
		final Cidade cidade = new Cidade();
		cidade.setEstado(DaoFactory.estadoInstance().findAll().get(0));
		cidade.setDescricao("Joinville");
		cidadeDao.save(cidade);
	}

}
