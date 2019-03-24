package com.br.unifacisa.arquitetura.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.unifacisa.arquitetura.entidades.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
