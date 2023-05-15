package com.netprecision.lanchonete.api.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.netprecision.lanchonete.api.entity.Produto;
import com.netprecision.lanchonete.api.entity.Pedido;

public class PedidoUtilTest {
	
	private Pedido pedido;
	
	@BeforeEach
    public void inicializar() {
		Produto cachorroQuente = new Produto(1147L, "Cachorro quente", 3.00, 3);
		Produto bauru = new Produto(1154L, "Bauru", 2.50, 1);
		Produto mistoQuente = new Produto(1164L, "Misto Quente", 2.00, 5);
		Produto xburger = new Produto(1155L, "X-Burger", 6.00, 6);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(cachorroQuente);
		produtos.add(bauru);
		produtos.add(mistoQuente);
		produtos.add(xburger);
		
		this.pedido = new Pedido(1L, produtos, 0.0, 0.0, 0.0, false);
    }
	
	@Test
    public void shouldCalculePrice() {
        pedido.setPrecoTotal(PedidoUtil.calcularPreco(pedido));
        assertEquals(57.50, pedido.getPrecoTotal());
    }
	
	@Test
    public void shouldCalculeChange() {
		pedido.setTotalPago(60.00);
        pedido.setPrecoTotal(57.50);
        assertEquals(2.50, PedidoUtil.calcularTroco(pedido));
    }

}
