package br.com.minhasfinancas.test.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.minhasfinancas.hibernate.dao.ContaDAO;
import br.com.minhasfinancas.hibernate.util.DaoFactory;
import br.com.minhasfinancas.modelos.Conta;

public class ContaTest {
	
	private static final Logger LOGGER = Logger.getLogger(ContaTest.class);
	
	private ContaDAO contaDao = DaoFactory.contaInstance();
	
	@Test
	public void testFindAll() {
		List<Conta> contas = this.contaDao.findAll();
		LOGGER.info(contas);
	}

}
