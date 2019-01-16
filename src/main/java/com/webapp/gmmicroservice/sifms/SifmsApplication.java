package com.webapp.gmmicroservice.sifms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SifmsApplication implements CommandLineRunner{

	
	private static final Logger log = LoggerFactory.getLogger(SifmsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SifmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

