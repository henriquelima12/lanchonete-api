package com.netprecision.lanchonete.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netprecision.lanchonete.api.entity.Produto;
import com.netprecision.lanchonete.api.repository.ProdutoRepository;

@Service
@Transactional
public class ProdutoService {
	
    private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutos() {
		return produtoRepository.findAll();
	}
	
	public void novoProduto(Produto produto) {
		produtoRepository.save(produto);
	}

}
