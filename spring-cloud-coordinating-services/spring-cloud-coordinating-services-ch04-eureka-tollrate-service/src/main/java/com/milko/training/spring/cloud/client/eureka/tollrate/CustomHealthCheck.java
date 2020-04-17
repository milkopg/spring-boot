package com.milko.training.spring.cloud.client.eureka.tollrate;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator {

	int errorcode = 0;
	
	@Override
	public Health health() {
		System.out.println("Health performed, error code: " + errorcode);
		if (errorcode > 4 && errorcode < 10) {
			errorcode++;
			return Health.down().withDetail("Custom error code", errorcode).build();
		} else {
			errorcode++;
			return Health.up().build();
		}
	}

}
