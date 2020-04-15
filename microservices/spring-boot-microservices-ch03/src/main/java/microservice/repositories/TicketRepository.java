package microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
