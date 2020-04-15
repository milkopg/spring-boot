package microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import microservice.domain.Ticket;

//@RepositoryRestResource(path = "bug")
//@RepositoryRestResource(exported = false)
public interface    TicketRepository extends JpaRepository<Ticket, Integer> {

}
