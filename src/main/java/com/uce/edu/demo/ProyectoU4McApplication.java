package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU4McApplication implements CommandLineRunner{
	
	private static final Logger LOGGER = Logger.getLogger(ProyectoU4McApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU4McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
