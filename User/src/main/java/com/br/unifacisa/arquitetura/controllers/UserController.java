package com.br.unifacisa.arquitetura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.unifacisa.arquitetura.entidades.User;
import com.br.unifacisa.arquitetura.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	public UserService userService;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(userService.consultar());
	}
}
