package com.br.unifacisa.arquitetura.servico;

import java.util.List;
import java.util.Optional;

import com.br.unifacisa.arquitetura.entidade.Product;
import com.br.unifacisa.arquitetura.repository.ProductRepository;

public class ProductService {
	
	private ProductRepository productRepository;
	
	public Product cadastrar(Product product)throws Exception {
		try {
			return productRepository.save(product);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Optional<Product> consultaPorId(Long id) {
		return productRepository.findById(id); 	
	}
	
	public List<Product> consultar(){
		return (List<Product>) productRepository.findAll();
	}
	
	public void delet(Product product) {
		productRepository.delete(product);
	}

}
