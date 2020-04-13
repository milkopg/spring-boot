package firstApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import firstApp.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
