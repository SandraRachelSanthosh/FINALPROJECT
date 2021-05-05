package com.example.ESPMA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerProjectManagerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProjectManagerAppApplication.class, args);
	}

}
