package br.com.minhasfinancas.test.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.minhasfinancas.hibernate.dao.CategoriaUsuarioDAO;
import br.com.minhasfinancas.hibernate.util.DaoFactory;
import br.com.minhasfinancas.modelos.CategoriaUsuario;

public class CategoriaUsuarioTest {
	
	private static final Logger LOGGER = Logger.getLogger(CategoriaUsuarioTest.class);
	
	private CategoriaUsuarioDAO catUsuDao = DaoFactory.categoriaUsuarioInstance();
	
	@Test
	public void testFindAll() {
		List<CategoriaUsuario> categoriasUsuario = this.catUsuDao.findAll();
		LOGGER.info(categoriasUsuario);
	}

}
