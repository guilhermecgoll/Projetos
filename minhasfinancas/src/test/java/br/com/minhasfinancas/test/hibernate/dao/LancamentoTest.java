package br.com.minhasfinancas.test.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.minhasfinancas.hibernate.dao.LancamentoDAO;
import br.com.minhasfinancas.hibernate.util.DaoFactory;
import br.com.minhasfinancas.modelos.Lancamento;

public class LancamentoTest {

	private static final Logger LOGGER = Logger.getLogger(LancamentoTest.class);
	
	private LancamentoDAO lancamentoDao = DaoFactory.lancamentoInstance();
	
	@Test
	public void testFindAll(){
		List<Lancamento> lancamentos = this.lancamentoDao.findAll();
		LOGGER.info(lancamentos);
	}
}
