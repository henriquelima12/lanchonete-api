package com.netprecision.lanchonete.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netprecision.lanchonete.api.entity.Pedido;
import com.netprecision.lanchonete.api.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
    PedidoService pedidoService;
	
	@GetMapping("/")
	public String getHello () {
        return "Olá mundo!";
    }
	
	@GetMapping("/get")
	public List<Pedido> getPedidos (@RequestParam("idPedido")Long idPedido) {
        return pedidoService.getPedidos();
    }
	
	@GetMapping("/calcularPreco/{id}")
	public Double calcularPreco(@PathVariable Long id) {
        return pedidoService.calcularPrecoByList(id);
    }
	
	@PostMapping("/")
    public void criarPedido(@RequestBody Pedido pedido) {
        pedidoService.criarPedido(pedido);
    }
	
	@PutMapping("/fecharPedido/{id}")
    public void fecharPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
        pedidoService.fecharPedido(id, pedido);
    }

}
