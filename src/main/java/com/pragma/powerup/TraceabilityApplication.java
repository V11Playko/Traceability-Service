package com.pragma.powerup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TraceabilityApplication {
	public static void main(String[] args) {
		SpringApplication.run(TraceabilityApplication.class, args);
	}

}
