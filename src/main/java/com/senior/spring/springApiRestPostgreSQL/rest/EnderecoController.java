package com.senior.spring.springApiRestPostgreSQL.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senior.spring.springApiRestPostgreSQL.service.ClienteService;

@RestController
@RequestMapping(value="/api")
public class EnderecoController {

	
	@Autowired
	private ClienteService  clienteService;
	
	@RequestMapping("/enderecoFindAll")
	public ResponseEntity<Void> findAll(){
		clienteService.listarCliente();
		return new ResponseEntity<>(HttpStatus.OK );	
	}
}
