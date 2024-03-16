package com.lakshay.Imp;

import com.lakshay.model.Task;
import com.lakshay.dao.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Task getById(Long id) {
        List<Task> result = jdbcTemplate.query(
            "SELECT * FROM tasks WHERE id = ?", 
            new BeanPropertyRowMapper<>(Task.class), 
            id
        );
        return result.isEmpty() ? null : result.get(0);
    }


    @Override
    public List<Task> getAll() {
        return jdbcTemplate.query("SELECT * FROM tasks", new BeanPropertyRowMapper<>(Task.class));
    }

    @Override
    public void save(Task task) {
        jdbcTemplate.update("INSERT INTO tasks (id, description, start_time, end_time, assigned_worker_id, task_priority) VALUES (?, ?, ?, ?, ?, ?)",
                task.getId(), task.getDescription(), task.getStartTime(), task.getEndTime(), task.getAssignedWorkerId(), task.getTaskPriority());
    }

    @Override
    public void update(Task task) {
        jdbcTemplate.update("UPDATE tasks SET description = ?, start_time = ?, end_time = ?, assigned_worker_id = ?, task_priority = ? WHERE id = ?",
                task.getDescription(), task.getStartTime(), task.getEndTime(), task.getAssignedWorkerId(), task.getTaskPriority(), task.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM tasks WHERE id = ?", id);
    }
}
