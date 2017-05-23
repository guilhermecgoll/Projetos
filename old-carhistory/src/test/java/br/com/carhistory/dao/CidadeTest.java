package br.com.carhistory.dao;

import java.util.List;

import br.com.carhistory.hibernate.dao.CidadeDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Cidade;

public class CidadeTest {
	
	
	private final CidadeDAO cidadeDao = DaoFactory.cidadeInstance();
	
	public void testFindAll() {
		final List<Cidade> estados= this.cidadeDao.findAll();
	}
	
	public void testPersist() throws Exception{
		final Cidade cidade = new Cidade();
		cidade.setEstado(DaoFactory.estadoInstance().findAll().get(0));
		cidade.setDescricao("Joinville");
		cidadeDao.save(cidade);
	}

}
