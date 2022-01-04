package com.salza;

import com.salza.Customer.Customer;
import com.salza.Customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalzaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SalzaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			Customer maria = new Customer("Maria", "Sharapova", "maria.sharapova@vincent.com", "29 / 1994 / 08");
			customerRepository.save(maria);

		};
	}
}
