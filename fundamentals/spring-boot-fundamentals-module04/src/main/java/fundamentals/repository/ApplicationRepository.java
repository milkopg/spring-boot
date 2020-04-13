package fundamentals.repository;

import org.springframework.data.repository.CrudRepository;

import fundamentals.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
