package fundamentals.mutator;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import fundamentals.entity.Application;
import fundamentals.exception.ApplicationNotFoundException;
import fundamentals.repository.ApplicationRepository;

@Component
public class Mutation implements GraphQLMutationResolver {
	private ApplicationRepository applicationRepository;
	
	public Mutation(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}
	
	public Application newApplication(String name, String owner,
			String description) {
		Application application = new Application(name, owner, description);
		applicationRepository.save(application);
		return application;
	}
	
	public boolean deleteApplication(Long id) {
		applicationRepository.deleteById(id);
		return true;
	}
	
	 public Application updateApplicationOwner(String newOwner, Long id) {
	        Optional<Application> optionalApplication =
	                applicationRepository.findById(id);

	        if(optionalApplication.isPresent()) {
	            Application application = optionalApplication.get();
	            application.setOwner(newOwner);
	            applicationRepository.save(application);
	            return application;
	        } else {
	            throw new ApplicationNotFoundException("Application Not Found", id);
	        }
	    }
}
