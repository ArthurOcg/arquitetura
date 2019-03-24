package com.br.unifacisa.arquitetura.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.unifacisa.arquitetura.entidade.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
