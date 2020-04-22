package config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ScDevServCh03ConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh03ConfigServerGitApplication.class, args);
	}

}
