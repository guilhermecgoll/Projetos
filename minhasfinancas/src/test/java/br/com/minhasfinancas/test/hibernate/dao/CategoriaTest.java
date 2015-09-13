package br.com.minhasfinancas.test.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.minhasfinancas.hibernate.dao.CategoriaDAO;
import br.com.minhasfinancas.hibernate.util.DaoFactory;
import br.com.minhasfinancas.modelos.Categoria;

public class CategoriaTest {
	
	private static final Logger LOGGER = Logger.getLogger(CategoriaTest.class);
	
	private CategoriaDAO categoriaDao = DaoFactory.categoriaInstance();
	
	@Test
	public void testFindAll() {
		List<Categoria> categorias = this.categoriaDao.findAll();
		LOGGER.info(categorias);
	}

}
