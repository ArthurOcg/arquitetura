package com.br.unifacisa.arquitetura.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.math.stat.descriptive.summary.Product;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long id;
	public List<Product> produtosAdquiridos;
	public Date data;
		
	
	public Order() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Product> getProdutosAdquiridos() {
		return produtosAdquiridos;
	}
	public void setProdutosAdquiridos(List<Product> produtosAdquiridos) {
		this.produtosAdquiridos = produtosAdquiridos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
