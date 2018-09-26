package com.senior.spring.springApiRestPostgreSQL.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.senior.spring.springApiRestPostgreSQL.bto.Cliente;

import com.senior.spring.springApiRestPostgreSQL.service.ClienteService;

@RestController
@RequestMapping(value="/api")
public class ClienteController {

	@Autowired
	private ClienteService  clienteService;
	   
	
		@GetMapping("/cliente")
	 	public ResponseEntity<Cliente> teste(){
			Cliente cliente = new Cliente(1L,"igor Zavati");
	 		return new ResponseEntity<Cliente>(cliente,HttpStatus.OK );	 		
	 	}
		
		@PostMapping("/cliente")
	 	public ResponseEntity<Void>cadastrar(@RequestBody Cliente cliente){
			clienteService.cadastrarCliente(cliente);
	 		return new ResponseEntity<Void>(HttpStatus.OK );	 		
	 	}
		@RequestMapping("/clienteFindAll")
		public ResponseEntity<Void> findAll(){
			clienteService.listarCliente();
			
			return new ResponseEntity<>(HttpStatus.OK );	
		}
	
	
	
}
