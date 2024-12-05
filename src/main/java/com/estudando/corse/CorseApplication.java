package com.estudando.corse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.estudando.corse")
@SpringBootApplication
public class CorseApplication {

	public static void main(String[] args) {

		SpringApplication.run(CorseApplication.class, args);


	}

}
