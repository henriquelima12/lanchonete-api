package com.netprecision.lanchonete.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netprecision.lanchonete.api.entity.Produto;
import com.netprecision.lanchonete.api.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
    ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> getProdutos() {
		return produtoService.getProdutos();
	}
	
	@PostMapping
	public void criarProduto(@RequestBody Produto produto) {
		produtoService.novoProduto(produto);
	}

}
