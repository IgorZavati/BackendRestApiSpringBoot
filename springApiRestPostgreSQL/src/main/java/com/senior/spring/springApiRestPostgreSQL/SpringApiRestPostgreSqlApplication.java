package com.senior.spring.springApiRestPostgreSQL;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringApiRestPostgreSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiRestPostgreSqlApplication.class, args);
	}
}
