package scoring.stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh07DataflowTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh07DataflowTask1Application.class, args);
	}
	
	@Bean
	public Task3 task3() {
		return new Task3();
	}
	
	public class Task3 implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			
			//do something important
			
			System.out.println("task 3 complete!");	
		}
	}
}
