package com.senior.spring.springApiRestPostgreSQL.util;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;

import com.senior.spring.springApiRestPostgreSQL.bto.Cliente;

@Component
public class Validator {

	public boolean StringValida(String valor) {
		
		return Strings.isEmpty(valor);
	}
	
	
	public Cliente validaLogin (Cliente cliente) {
		
		if(cliente == null){
			
			System.out.println("Não foi passado Login");
			
		}
		
		return cliente;
	}
	
	
}
