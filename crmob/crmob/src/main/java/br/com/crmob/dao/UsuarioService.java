package br.com.crmob.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.crmob.model.Usuario;

@Repository
public class UsuarioService implements UserDetailsService {

	private static final Logger LOG = LoggerFactory.getLogger(UsuarioService.class);

	@PersistenceContext
	private EntityManager manager;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<Usuario> usuarios = manager
				.createQuery("select u from Usuario u where u.username = :username", Usuario.class)
				.setParameter("username", username).getResultList();
		if (usuarios.isEmpty()) {
			throw new UsernameNotFoundException("Usuário " + username + " não encontrado");
		}
		return usuarios.get(0);
	}

	public Usuario loadUsuarioByUsername(String username) {
		Usuario retUsu = null;
		try {
			UserDetails usu = loadUserByUsername(username);
			retUsu = (Usuario) usu;
		} catch (UsernameNotFoundException e) {
			LOG.warn(String.format("Usuário {0} não encontrado", username));
		}
		return retUsu;
	}

}
