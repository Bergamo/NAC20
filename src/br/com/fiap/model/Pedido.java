package br.com.fiap.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;


public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private Date dataEmissao;
	private Date dataProcessamento;
	private BigDecimal totalPedido;
	private Cliente cliente;
	private List<ItemPedido> itemPedido;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getDataProcessamento() {
		return dataProcessamento;
	}
	public void setDataProcessamento(Date dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}
	public BigDecimal getTotalPedido() {
		return totalPedido;
	}
	public void setTotalPedido(BigDecimal totalPedido) {
		this.totalPedido = totalPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}
	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
}
