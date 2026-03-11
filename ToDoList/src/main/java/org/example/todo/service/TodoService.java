package org.example.todo.service;

import org.example.todo.model.TodoTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service // Говорим Спрингу: "Возьми этот класс под управление"
public class TodoService {
    // Наше временное хранилище в памяти
    private final List<TodoTask> tasks = new ArrayList<>();
    // Счетчик для генерации ID
    private final AtomicLong counter = new AtomicLong();

    public List<TodoTask> getAllTasks() {
        return tasks;
    }

    public TodoTask addTask(String title) {
        TodoTask newTask = new TodoTask(counter.incrementAndGet(), title, false);
        tasks.add(newTask);
        return newTask;
    }
}