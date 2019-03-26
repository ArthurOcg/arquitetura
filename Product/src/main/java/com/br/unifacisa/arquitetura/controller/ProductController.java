package com.br.unifacisa.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unifacisa.arquitetura.entidade.Product;
import com.br.unifacisa.arquitetura.servico.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	
	@Autowired
	public ProductService productService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAll(){
		return ResponseEntity.ok(productService.consultar());
	}
}
