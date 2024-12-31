package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.emp"})
public class FhceEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FhceEmpApplication.class, args);
	}

}
