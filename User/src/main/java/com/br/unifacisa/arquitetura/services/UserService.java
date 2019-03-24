package com.br.unifacisa.arquitetura.services;


import java.util.List;
import java.util.Optional;

import com.br.unifacisa.arquitetura.entidades.User;
import com.br.unifacisa.arquitetura.repository.UserRepository;

public class UserService {

	private UserRepository userRepository;
	
	public User cadastrar(User user)throws Exception {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Optional<User> consultaPorId(Long id) {
		return userRepository.findById(id); 	
	}
	
	public List<User> consultar(){
		return (List<User>) userRepository.findAll();
	}
	
	public void delet(User user) {
		userRepository.delete(user);
	}
}
