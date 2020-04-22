package zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import zipkin2.server.internal.EnableZipkinServer;

import zipkin.server.EnableZipkinServer;;


@EnableZipkinServer
@SpringBootApplication
public class ScDevServCh06ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh06ZipkinserverApplication.class, args);
	}

}
