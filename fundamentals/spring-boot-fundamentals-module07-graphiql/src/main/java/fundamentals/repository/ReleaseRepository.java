package fundamentals.repository;

import org.springframework.data.repository.CrudRepository;

import fundamentals.entity.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}