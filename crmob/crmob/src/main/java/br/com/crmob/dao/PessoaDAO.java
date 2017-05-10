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
		return manager.createQuery("select p from Pessoa p", Pessoa.class).getResultList();
	}

	public Pessoa getPessoaByCpfCnpj(String cpfCnpj) {
		Pessoa pessoa = null;
		List<Pessoa> pessoas = manager
				.createQuery("select p from Pessoa p where p.cpfCnpj = :cpfCnpj", Pessoa.class)
				.setParameter("cpfCnpj", cpfCnpj).getResultList();
		
		if (!pessoas.isEmpty())
			pessoa = pessoas.get(0);
		
		return pessoa; 
	}
}
