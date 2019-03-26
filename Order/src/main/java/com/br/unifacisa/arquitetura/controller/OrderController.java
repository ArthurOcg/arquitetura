package com.br.unifacisa.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unifacisa.arquitetura.entidade.Order;
import com.br.unifacisa.arquitetura.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {

	@Autowired
	public OrderService orderService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Order>> getAll(){
		return ResponseEntity.ok(orderService.consultar());
	}
}
