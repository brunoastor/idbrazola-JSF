package br.com.idbrasil.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.idbrasil.model.Produto;

public class ProdutoDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro");
	private EntityManager em = emf.createEntityManager();

	public void salvar(Produto produto) {
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}

}
