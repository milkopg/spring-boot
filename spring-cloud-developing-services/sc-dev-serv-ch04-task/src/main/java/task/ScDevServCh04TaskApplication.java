package task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class ScDevServCh04TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh04TaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}

	public class TollProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... strings) throws Exception {
			// stationid, licence plate, timestamp
			if (strings != null) {
				System.out.println("Parameters lenth: "+ strings.length);
				
				String stationId = strings[0];
				String licensePlate = strings[1];
				String timestamp = strings[2];
				
				System.out.println("Station ID is " + stationId + ", plate is " + licensePlate + ", timestamp is " + timestamp);
			}
			
			
		}
		
	}
}
