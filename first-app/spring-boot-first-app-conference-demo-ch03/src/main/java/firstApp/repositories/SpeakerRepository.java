package firstApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import firstApp.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
