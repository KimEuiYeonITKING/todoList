package com.solideos.todolist.service;

import com.solideos.todolist.domain.Todo;
import com.solideos.todolist.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    // R
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // R
    public Optional<Todo> getTodoByTodoNum(Long todoNum) {
        return todoRepository.findById(todoNum);
    }

    // C , U
    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // D
    public void deleteTodo(Long todoNum) {
        todoRepository.deleteById(todoNum);
    }
}
