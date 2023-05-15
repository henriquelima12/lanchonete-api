package com.netprecision.lanchonete.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netprecision.lanchonete.api.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
