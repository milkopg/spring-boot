package readinglist;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import readinglist.handler.ReaderHandlerMethodArgumentResolver;

@SpringBootApplication
public class Chapter3Application extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(Chapter3Application.class, args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
	}
}
