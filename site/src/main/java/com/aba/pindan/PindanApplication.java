package com.aba.pindan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.aba.pindan")
@SpringBootApplication
public class PindanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PindanApplication.class, args);
	}

}
