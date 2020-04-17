package com.milko.training.spring.cloud.client.eureka.fastpass.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker //Disable it for Ribbon only
@EnableEurekaClient //Disable it for Ribbon only
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh05EurekaFastpassConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh05EurekaFastpassConsoleApplication.class, args);
	}

}
