package tasksink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class ScDevServCh04TasksinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh04TasksinkApplication.class, args);
	}

}
