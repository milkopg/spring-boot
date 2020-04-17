package com.milko.training.spring.cloud.hystrix.tyrbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh05HystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh05HystrixTurbineApplication.class, args);
	}

}
