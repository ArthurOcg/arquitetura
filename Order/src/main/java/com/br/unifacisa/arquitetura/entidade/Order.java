package com.br.unifacisa.arquitetura.entidade;

import java.util.Date;
import java.util.List;

public class Order {

	
	public Long id;
	public List produtosAdquiridos;
	public Date data;
		
	
	public Order() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List getProdutosAdquiridos() {
		return produtosAdquiridos;
	}
	public void setProdutosAdquiridos(List produtosAdquiridos) {
		this.produtosAdquiridos = produtosAdquiridos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
