package com.netprecision.lanchonete.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netprecision.lanchonete.api.entity.Pedido;
import com.netprecision.lanchonete.api.entity.Produto;
import com.netprecision.lanchonete.api.repository.PedidoRepository;
import com.netprecision.lanchonete.api.repository.ProdutoRepository;

import static com.netprecision.lanchonete.api.util.PedidoUtil.*;;

@Service
@Transactional
public class PedidoService {
	
    private PedidoRepository pedidoRepository;
	private ProdutoRepository produtoRepository;
	
	public List<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}
	
	public Optional<Pedido> getPedidoById(Long id) {
		return pedidoRepository.findById(id);
	}
	
	public Optional<Produto> getProdutoById(Long id){
		return produtoRepository.findById(id);
	}
	
	public void criarPedido(Pedido pedido) {
		pedido.setFechado(false);
        pedidoRepository.save(pedido);
    }
	
	public void adicionarProduto(Long idPedido, Long idProduto, int quantidade) {
		Pedido pedido = this.getPedidoById(idPedido).get();
		pedido.getProdutos().add(this.getProdutoById(idProduto).get());
	}
	
	public void removerProduto(Long idPedido, Long idProduto, int quantidade) {
		Pedido pedido = this.getPedidoById(idPedido).get();
		pedido.getProdutos().remove(this.getProdutoById(idProduto).get());
	}
	
	public Double calcularPrecoById(Long idPedido) {
		return this.getPedidoById(idPedido).get().getPrecoTotal();
	}
	
	public Double calcularPrecoByList(Long idPedido) {
		Pedido pedido = this.getPedidoById(idPedido).get();
		return calcularPreco(pedido);
	}
	
	public void fecharPedido(Long idPedido, Pedido pedido) {
		pedido = this.getPedidoById(idPedido).get();
		pedido.setFechado(true);
		pedido.setPrecoTotal(calcularPreco(pedido));
		pedidoRepository.save(pedido);
	}

}
