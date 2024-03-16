package com.lakshay.Imp;

import com.lakshay.model.Equipment;
import com.lakshay.dao.EquipmentDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.dao.EmptyResultDataAccessException;


import java.util.List;

@Repository
public class EquipmentDAOImpl implements EquipmentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Equipment getById(Long id) {
        try {
            return jdbcTemplate.queryForObject(
                "SELECT * FROM equipment WHERE id = ?", 
                new BeanPropertyRowMapper<>(Equipment.class),
                id
            );
        } catch (EmptyResultDataAccessException e) {
            return null; // or handle the empty case accordingly
        }
    }

    @Override
    public List<Equipment> getAll() {
        return jdbcTemplate.query("SELECT * FROM equipment", new BeanPropertyRowMapper<>(Equipment.class));
    }

    @Override
    public void save(Equipment equipment) {
        jdbcTemplate.update("INSERT INTO equipment (id, name, availability_status) VALUES (?, ?, ?)",
                equipment.getId(), equipment.getName(), equipment.getAvailabilityStatus());
    }

    @Override
    public void update(Equipment equipment) {
        jdbcTemplate.update("UPDATE equipment SET name = ?, availability_status = ? WHERE id = ?",
                equipment.getName(), equipment.getAvailabilityStatus(), equipment.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM equipment WHERE id = ?", id);
    }
}
