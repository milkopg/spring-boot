package com.milko.training.spring.cloud.client.eureka.fastpass.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//@EnableTurbine - when you use one service with url uncomment it
@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh05HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh05HystrixDashboardApplication.class, args);
	}

}
