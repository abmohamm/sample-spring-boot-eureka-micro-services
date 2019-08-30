package com.app.samples.eureka.springbooteurekamicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaMicroServicesApplication.class, args);
	}

}
