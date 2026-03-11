package org.example.todo.controller;

import org.example.todo.model.TodoTask;
import org.example.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Говорим Spring: "Это контроллер, который будет возвращать JSON"
@RequestMapping("/api/todos") // Базовый URL для всех эндпоинтов в этом классе
public class TodoController {

    private final TodoService todoService;

    // Внедрение зависимости (Dependency Injection) через конструктор.
    // Spring сам найдет TodoService и передаст его сюда.
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // Обработка GET-запроса по адресу /api/todos
    @GetMapping
    public List<TodoTask> getAllTasks() {
        // Просим сервис отдать все задачи
        return todoService.getAllTasks();
    }

    // Обработка POST-запроса по адресу /api/todos
    @PostMapping
    public TodoTask createTask(@RequestBody String title) {
        // @RequestBody берет данные из "тела" HTTP-запроса
        // и передает их в наш метод
        return todoService.addTask(title);
    }
}