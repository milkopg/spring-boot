package startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScDevServCh02StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDevServCh02StartupApplication.class, args);
	}

	
	@RequestMapping(value = "greeting", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello from Spring boot";
	}
}
