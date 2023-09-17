package br.com.idbrasil.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import br.com.idbrasil.dao.ProdutoDAO;
import br.com.idbrasil.model.Produto;

@ManagedBean
@Named("produtos")
@ViewScoped
public class ProdutoBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Produto produto = new Produto();
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	private List<Produto> produtos = new ArrayList<>();

	public void salvar() {
		produtoDAO.salvar(produto);
		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ProdutoDAO getProdutoDAO() {
		return produtoDAO;
	}

	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
