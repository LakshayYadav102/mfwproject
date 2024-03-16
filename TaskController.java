package com.lakshay.controller;
import com.lakshay.model.Task;
import com.lakshay.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping // Remove the trailing slash
    public List<Task> getAllTasks() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getById(id);
    }

    @PostMapping // Remove the trailing slash
    public void addTask(@RequestBody Task task) {
        taskService.save(task);
    }

    @PutMapping("/{id}")
    public void updateTask(@RequestBody Task task, @PathVariable Long id) {
        task.setId(id); // Ensure the ID is set from the path variable
        taskService.update(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.delete(id);
    }
}
