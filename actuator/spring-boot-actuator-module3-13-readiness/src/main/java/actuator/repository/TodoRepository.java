package actuator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import actuator.model.TodoList;

@Repository
public interface TodoRepository extends CrudRepository<TodoList, Long> {

}
