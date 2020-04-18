package com.milko.training.spring.cloud.zuul.apiproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.milko.training.spring.cloud.zuul.apiproxy.filters.ProxyFilter;
import com.milko.training.spring.cloud.zuul.apiproxy.filters.StartPreFilter;
import com.milko.training.spring.cloud.zuul.apiproxy.filters.StopPostFilter;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudCoordinatingServicesCh06ZuulApiproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCoordinatingServicesCh06ZuulApiproxyApplication.class, args);
	}

	@Bean
	public ProxyFilter proxyFilter() {
		return new ProxyFilter();
	}
	
	@Bean
	public StartPreFilter startPreFilter() {
		return new StartPreFilter();
	}
	
	@Bean
	public StopPostFilter stopPostFilter() {
		return new StopPostFilter();
	}
	
}
