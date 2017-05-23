package br.com.carhistory.dao;

import java.util.List;

import br.com.carhistory.hibernate.dao.PaisDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Pais;


public class PaisTest {
	
	private final PaisDAO paisDao = DaoFactory.paisInstance();
	
	public void testFindAll() {
		final List<Pais> paises = this.paisDao.findAll();
	}
	
	public void testPersist() throws Exception{
		final Pais pais = new Pais();
		pais.setBacenId(1058L);
		pais.setDescricao("Brasil");
		pais.setSigla("BR");
		paisDao.save(pais);
	}

}
