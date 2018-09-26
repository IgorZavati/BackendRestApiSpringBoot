	package com.senior.spring.springApiRestPostgreSQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senior.spring.springApiRestPostgreSQL.bto.Cliente;

import com.senior.spring.springApiRestPostgreSQL.repository.ClienteRepository;
import com.senior.spring.springApiRestPostgreSQL.repository.EnderecoRepository;
import com.senior.spring.springApiRestPostgreSQL.util.Util;
import com.senior.spring.springApiRestPostgreSQL.util.Validator;

@Service
public class ClienteService {

	@Autowired
	private Validator validator;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired EnderecoRepository endereceRepository;
	@Autowired Util util;
	
	public void cadastrarCliente( Cliente cliente) {
	
		System.out.println(validator.StringValida(cliente.getNome()));
		clienteRepository.save(cliente);
	
	}
	
	public void removerCliente(Cliente cliente) {
		System.out.println(validator.StringValida(cliente.getNome()));
	    clienteRepository.deleteById(cliente.getId());
	}
	public void listarCliente() {	
		  
		List<Cliente>listaClientes = (List<Cliente>) clienteRepository.findAll();
		util.imprimirClientes(listaClientes);
	
	}
		
	
	
}
