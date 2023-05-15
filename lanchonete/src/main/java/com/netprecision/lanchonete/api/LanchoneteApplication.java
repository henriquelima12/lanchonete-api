package com.netprecision.lanchonete.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class LanchoneteApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanchoneteApplication.class, args);
	}

}
