package com.lakshay.service.imp;
import com.lakshay.model.Task;
import com.lakshay.service.TaskService;
import com.lakshay.dao.TaskDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDAO taskDAO;

    @Override
    public Task getById(Long id) {
        return taskDAO.getById(id);
    }

    @Override
    public List<Task> getAll() {
        return taskDAO.getAll();
    }

    @Override
    public void save(Task task) {
        taskDAO.save(task);
    }

    @Override
    public void update(Task task) {
        taskDAO.update(task);
    }

    @Override
    public void delete(Long id) {
        taskDAO.delete(id);
    }
}
