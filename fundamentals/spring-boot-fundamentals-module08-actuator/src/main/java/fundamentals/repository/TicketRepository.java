package fundamentals.repository;

import org.springframework.data.repository.CrudRepository;

import fundamentals.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
