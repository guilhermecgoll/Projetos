package br.com.carhistory.dao;

import java.util.Calendar;

import org.junit.Test;

import br.com.carhistory.hibernate.dao.UsuarioDAO;
import br.com.carhistory.hibernate.util.DaoFactory;
import br.com.carhistory.model.Usuario;

public class UsuarioTest {
	
	
	private final UsuarioDAO usuarioDao = DaoFactory.usuarioInstance();
	
	@Test
	public void testPersist(){
		
		final Usuario usu = new Usuario();
		usu.setNome("Teste");
		usu.setEmail("admin@admin");
		usu.setPassword("admin");
		usu.setHabilitado(true);
		usu.setCidadeUsuario(DaoFactory.cidadeInstance().findAll().get(0));
		usu.setSobrenome("Silva");
		usu.setUltimoLogin(Calendar.getInstance());
		try {
			usuarioDao.save(usu);
		} catch (final Exception e) {
			e.printStackTrace();
		} 
		
	}
}
