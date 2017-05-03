package br.com.crmob.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.crmob.model.Pessoa;

@Repository
@Transactional
public class PessoaDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Pessoa pessoa){
		manager.persist(pessoa);
	}
	
	public List<Pessoa> listar(){
		return manager.createQuery("select p from Produto p", Pessoa.class).getResultList();
	}
}
