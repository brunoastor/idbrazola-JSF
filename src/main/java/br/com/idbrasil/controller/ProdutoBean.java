package br.com.idbrasil.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.idbrasil.dao.ProdutoDAO;
import br.com.idbrasil.model.Produto;

@RequestScoped
@Named("produtos")
public class ProdutoBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Produto produto = new Produto();
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	private List<Produto> produtos = new ArrayList<>();

	public void salvar() {
		produtoDAO.salvar(produto);
		produto = new Produto(); // Reset
	}
}
