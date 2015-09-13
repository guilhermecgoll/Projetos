package br.com.minhasfinancas.test.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.minhasfinancas.hibernate.dao.UsuarioDAO;
import br.com.minhasfinancas.hibernate.util.DaoFactory;
import br.com.minhasfinancas.modelos.Usuario;

public class UsuarioTest {
	
	private static final Logger LOGGER = Logger.getLogger(UsuarioTest.class);
	
	private UsuarioDAO usuarioDao = DaoFactory.usuarioInstance();
	
	@Test
	public void insereUsuario() {
		Usuario usu = new Usuario();
		usu.setHabilitado(true);
		usu.setNome("José");
		usu.setPassword("auhdasu");
		usu.setUsername("joselito");
		try {
			this.usuarioDao.save(usu);
			LOGGER.info("Usuário inserido: " +usu);
		} catch (Exception e) {		
			LOGGER.error(e);
		}
	}
	
	@Test
	public void testFindAll(){
		List<Usuario> usuarios = this.usuarioDao.findAll();
		LOGGER.info(usuarios);
	}

}
