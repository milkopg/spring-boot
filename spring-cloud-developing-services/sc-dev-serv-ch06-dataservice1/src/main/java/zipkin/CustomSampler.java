package zipkin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class CustomSampler {
	
	@Bean
	public Sampler smartSampler() {
		
		return new Sampler() {
		
			@Override
			public boolean isSampled(long traceId) {
				System.out.println("custom sampler used! TraceId: " + traceId);
				return false;
			}
		};
		
	}

}
