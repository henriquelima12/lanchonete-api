package com.netprecision.lanchonete.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netprecision.lanchonete.api.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
