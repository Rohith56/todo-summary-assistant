package com.todo.server.controller;

import com.todo.server.model.Todo;
import com.todo.server.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@CrossOrigin(origins = "*")  // allow frontend calls during dev
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}
