package config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ScDevServCh03ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh03ConfigServerApplication.class, args);
	}

}
