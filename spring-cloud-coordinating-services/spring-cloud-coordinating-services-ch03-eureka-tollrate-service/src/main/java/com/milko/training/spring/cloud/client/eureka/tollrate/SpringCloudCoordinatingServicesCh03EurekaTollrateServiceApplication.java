package com.milko.training.spring.cloud.client.eureka.tollrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh03EurekaTollrateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh03EurekaTollrateServiceApplication.class, args);
	}

}
