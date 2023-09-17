package br.com.idbrasil.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.idbrasil.model.Produto;

public class ProdutoDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro");
	private EntityManager em = emf.createEntityManager();

	public void salvar(Produto produto) {
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}

	public Produto buscarPorId(Long id) {
		return em.find(Produto.class, id);
	}

	public List<Produto> listarTodos() {
		TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p", Produto.class);
		return query.getResultList();
	}
}
