package com.netprecision.lanchonete.api.util;

import com.netprecision.lanchonete.api.entity.Pedido;

public class PedidoUtil {
	
	public static Double calcularPreco(Pedido pedido) {
		return pedido.getProdutos().stream().mapToDouble(
				produto -> produto.getPreco().doubleValue() * produto.getQuantidade()).sum();
	}
	
	public static Double calcularTroco(Pedido pedido) {
		return pedido.getTotalPago() - pedido.getPrecoTotal();
	}

}
