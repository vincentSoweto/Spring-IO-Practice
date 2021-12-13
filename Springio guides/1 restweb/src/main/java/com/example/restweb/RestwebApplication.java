package com.example.restweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RestwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwebApplication.class, args);
	}

}
