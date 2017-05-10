package br.com.crmob.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.crmob.model.Usuario;

@Repository
@Transactional
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager manager;

	@Autowired
	UsuarioService usuService;

	public void gravar(Usuario usuario) {
		manager.persist(usuario);
	}

	public Usuario loadUsuarioByUsername(String username) {
		return usuService.loadUsuarioByUsername(username);
	}

}
