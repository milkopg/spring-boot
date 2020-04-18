package com.milko.training.spring.cloud.client.eureka.tollrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh06EurekaTollrateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh06EurekaTollrateServiceApplication.class, args);
	}

}