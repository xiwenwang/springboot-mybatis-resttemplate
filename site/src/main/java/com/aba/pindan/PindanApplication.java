package com.aba.pindan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PindanApplication {

	public static void main(String[] args) {
		SpringApplication.run(PindanApplication.class, args);
	}

}
