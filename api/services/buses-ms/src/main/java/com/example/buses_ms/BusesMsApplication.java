package com.example.buses_ms;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BusesMsApplication {
	public static final Logger logger = Logger.getLogger(SpringApplication.class.toString());

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));
		SpringApplication.run(BusesMsApplication.class, args);
		logger.info("Application started and running on port " + dotenv.get("SERVER_PORT"));
	}

}
