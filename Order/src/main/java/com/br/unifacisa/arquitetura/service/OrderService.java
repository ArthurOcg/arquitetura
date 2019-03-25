package com.br.unifacisa.arquitetura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.unifacisa.arquitetura.entidade.Order;
import com.br.unifacisa.arquitetura.repository.OrderRepository;

public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public Order cadastrar(Order order)throws Exception {
		try {
			return orderRepository.save(order);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Optional<Order> consultaPorId(Long id) {
		return orderRepository.findById(id); 	
	}
	
	public List<Order> consultar(){
		return (List<Order>) orderRepository.findAll();
	}
	
	public void delet(Order order) {
		orderRepository.delete(order);
	}
	
}
