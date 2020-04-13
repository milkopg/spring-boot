package fundamentals.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class PeopleHealthIndicator implements HealthIndicator{

	private static final String MESSAGE_KEY = "PeopleService";;
	
	@Override
	public Health health() {
		if (!isRunningPeopleService()) {
			return Health.down().withDetail(MESSAGE_KEY, "Not available").build();
		}
		return Health.up().withDetail(MESSAGE_KEY, "Available").build();
	}

	private boolean isRunningPeopleService() {
		Boolean isRunning = false;
		return isRunning;
	}
}
