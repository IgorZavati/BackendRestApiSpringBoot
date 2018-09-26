package com.senior.spring.springApiRestPostgreSQL.repository;


import org.springframework.data.repository.CrudRepository;

import com.senior.spring.springApiRestPostgreSQL.bto.Cliente;

public interface ClienteRepository  extends CrudRepository<Cliente,Long> {
	
}
