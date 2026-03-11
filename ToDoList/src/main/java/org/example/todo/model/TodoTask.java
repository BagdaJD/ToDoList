package org.example.todo.model;

public class TodoTask {
    private Long id;
    private String title;
    private boolean completed;

    // Конструктор
    public TodoTask(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Геттеры и сеттеры (нужны, чтобы Spring мог прочитать данные и превратить их в JSON)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}