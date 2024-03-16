package com.lakshay.Imp;

import com.lakshay.model.Worker;
import com.lakshay.dao.WorkerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkerDAOImpl implements WorkerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Worker getById(Long id) {
        return jdbcTemplate.queryForObject(
            "SELECT * FROM workers WHERE id = ?", 
            new BeanPropertyRowMapper<>(Worker.class),
            id
        );
    }

    @Override
    public List<Worker> getAll() {
        return jdbcTemplate.query("SELECT * FROM workers", new BeanPropertyRowMapper<>(Worker.class));
    }

    @Override
    public void save(Worker worker) {
        jdbcTemplate.update("INSERT INTO workers (id, name, contact_info, role) VALUES (?, ?, ?, ?)",
                worker.getId(), worker.getName(), worker.getContactInfo(), worker.getRole());
    }

    @Override
    public void update(Worker worker) {
        jdbcTemplate.update("UPDATE workers SET name = ?, contact_info = ?, role = ? WHERE id = ?",
                worker.getName(), worker.getContactInfo(), worker.getRole(), worker.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM workers WHERE id = ?", id);
    }
}
