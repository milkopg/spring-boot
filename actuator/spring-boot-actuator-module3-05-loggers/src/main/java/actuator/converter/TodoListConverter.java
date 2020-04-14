package actuator.converter;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import actuator.dto.TodoItemDto;
import actuator.dto.TodoListDto;
import actuator.model.TodoItem;
import actuator.model.TodoList;

@Component
public class TodoListConverter implements Converter<TodoList, TodoListDto> {

    private TodoItemConverter itemConverter;

    @Inject
    public TodoListConverter(TodoItemConverter itemConverter) {
        this.itemConverter = itemConverter;
    }

    @Override
    public TodoListDto convert(TodoList todoList) {
        List<TodoItem> items = todoList.getItems();

        List<TodoItemDto> itemDtos = items.stream()
                .map(itemConverter::convert)
                .collect(Collectors.toList());

        return new TodoListDto(todoList.getName(), itemDtos);
    }
}
