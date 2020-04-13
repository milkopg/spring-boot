package readinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import readinglist.model.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String>{

	public UserDetails findByUsername(String username);
}
