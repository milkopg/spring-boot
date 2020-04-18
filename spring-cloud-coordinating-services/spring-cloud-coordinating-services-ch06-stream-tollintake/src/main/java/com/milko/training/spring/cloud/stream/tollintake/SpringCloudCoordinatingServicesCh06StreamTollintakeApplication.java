package com.milko.training.spring.cloud.stream.tollintake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Sink.class)
//@EnableBinding(Processor.class)
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh06StreamTollintakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh06StreamTollintakeApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	//@ServiceActivator(inputChannel = Sink.INPUT)
	//@StreamListener(Processor.INPUT)
	//@SendTo(Processor.OUTPUT)
	public void log(String message) {
	//public String log(String message) {
		System.out.println(message);
		//return message;
	}
	
	//@ServiceActivator(inputChannel=Sink.INPUT)
		//@SendTo(Processor.OUTPUT) //resend message
		@StreamListener(target=Sink.INPUT, condition="headers['speed'] > 40")
		public void logfast(String msg) {
			System.out.println("fast = " + msg);
			//return msg;
		}
		
		@StreamListener(target=Sink.INPUT, condition="headers['speed'] <= 40")
		public void logslow(String msg) {
			System.out.println("slow = " + msg);
			//return msg;
		}
}
