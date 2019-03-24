package com.br.unifacisa.arquitetura.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.unifacisa.arquitetura.entidade.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
