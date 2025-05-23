package com.example.buses_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BusesMsApplication {
	public static final Logger logger = Logger.getLogger(SpringApplication.class.toString());

	public static void main(String[] args) {
		SpringApplication.run(BusesMsApplication.class, args);
		logger.info("Application started and running on port 8001");
	}

}
