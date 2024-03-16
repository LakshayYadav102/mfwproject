package com.lakshay.service;
import com.lakshay.model.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);
    List<Task> getAll();
    void save(Task task);
    void update(Task task);
    void delete(Long id);
}
