package actuator.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import actuator.converter.TodoListConverter;
import actuator.dto.TodoListDto;
import actuator.repository.TodoRepository;

@Service
public class TodoService {

    private TodoListConverter todoListConverter;
    private TodoRepository todoRepository;

    @Inject
    public TodoService(TodoListConverter todoListConverter,
                       TodoRepository todoRepository) {
        this.todoListConverter = todoListConverter;
        this.todoRepository = todoRepository;
    }

    public List<TodoListDto> getTodoLists() {
       return StreamSupport.stream(todoRepository.findAll().spliterator(), false)
                .map(todoListConverter::convert)
                .collect(Collectors.toList());
    }
}
