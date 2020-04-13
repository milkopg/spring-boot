package fundamentals.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import fundamentals.entity.Application;
import fundamentals.repository.ApplicationRepository;

@Component
public class Query implements GraphQLQueryResolver{
	private ApplicationRepository applicationRepository;
	
	public Query(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}
	
	public Iterable<Application> findAllApplications() {
		return applicationRepository.findAll();
	}
	
	public long countApplications() {
		return applicationRepository.count();
	}
}
