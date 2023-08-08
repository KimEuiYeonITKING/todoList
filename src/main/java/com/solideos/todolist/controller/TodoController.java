package com.solideos.todolist.controller;


import com.solideos.todolist.domain.Todo;
import com.solideos.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private final TodoService todoService;
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
    @GetMapping("/{todoNum}")
    public Optional<Todo> getTodoByTodoNum(@PathVariable Long todoNum) {
        return todoService.getTodoByTodoNum(todoNum);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.saveTodo(todo);
    }

    @PutMapping("/{todoNum}")
    public Todo updateTodo(@PathVariable Long todoNum, @RequestBody Todo todo) {
        todo.setTodoNum(todoNum);
        return todoService.saveTodo(todo);
    }

    @DeleteMapping("/{todoNum}")
    public void deleteTodo(@PathVariable Long todoNum) {
        todoService.deleteTodo(todoNum);
    }

}
