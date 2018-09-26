package com.senior.spring.springApiRestPostgreSQL.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.senior.spring.springApiRestPostgreSQL.bto.Cliente;

@Component
public class Util {

	public void imprimirClientes(List<Cliente> lista) {
		for (Cliente cliente : lista) {
			System.out.println(cliente.getNome());
		}
	}
	
	
}
