package taskintake;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class TaskProcessor {
	@Autowired
	private Source source;
	
	private final String appName = "Toll Processor";
	
	public void publishRequest(String payload) {
		String url = "maven://com.milko.training.spring.cloud:sc-dev-serv-ch04-task:jar:0.0.1-SNAPSHOT";
		
		List<String> input = Arrays.asList(payload.split(","));	
		
		TaskLaunchRequest request = new TaskLaunchRequest(url, input, null, null, appName);
		GenericMessage<TaskLaunchRequest> message = new GenericMessage<TaskLaunchRequest>(request);
		this.source.output().send(message);
	}
}
