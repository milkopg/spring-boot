package com.milko.training.spring.cloud.client.eureka.fastpass.console;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TollSource {
	@Output("fastpassTollChannel")
	MessageChannel fastPassToll();
	
	@Output("standardTollChannel")
	MessageChannel standardToll();
}
