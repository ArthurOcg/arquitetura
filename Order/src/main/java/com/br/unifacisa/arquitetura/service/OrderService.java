package com.br.unifacisa.arquitetura.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.unifacisa.arquitetura.repository.OrderRepository;

public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

}
