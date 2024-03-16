package com.lakshay.Imp;

import com.lakshay.model.Assignee;
import com.lakshay.dao.AssigneeDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AssigneeDAOImpl implements AssigneeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Assignee getById(Long id) {
        List<Assignee> result = jdbcTemplate.query("SELECT * FROM assignees WHERE id = ?", 
                new BeanPropertyRowMapper<>(Assignee.class), id);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public List<Assignee> getAll() {
        return jdbcTemplate.query("SELECT * FROM assignees", new BeanPropertyRowMapper<>(Assignee.class));
    }

    @Override
    public void save(Assignee assignee) {
        jdbcTemplate.update("INSERT INTO assignees (id, worker_id) VALUES (?, ?)",
                assignee.getId(), assignee.getWorkerId());
    }

    @Override
    public void update(Assignee assignee) {
        jdbcTemplate.update("UPDATE assignees SET worker_id = ? WHERE id = ?",
                assignee.getWorkerId(), assignee.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM assignees WHERE id = ?", id);
    }
}
