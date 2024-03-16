package com.lakshay.Imp;

import com.lakshay.model.ProductionLine;
import com.lakshay.dao.ProductionLineDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductionLineDAOImpl implements ProductionLineDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public ProductionLine getById(Long id) {
        return jdbcTemplate.queryForObject(
            "SELECT * FROM production_lines WHERE id = ?", 
            new BeanPropertyRowMapper<>(ProductionLine.class),
            id
        );
    }


    @Override
    public List<ProductionLine> getAll() {
        return jdbcTemplate.query("SELECT * FROM production_lines", new BeanPropertyRowMapper<>(ProductionLine.class));
    }

    @Override
    public void save(ProductionLine productionLine) {
        jdbcTemplate.update("INSERT INTO production_lines (id, capacity) VALUES (?, ?)",
                productionLine.getId(), productionLine.getCapacity());
    }

    @Override
    public void update(ProductionLine productionLine) {
        jdbcTemplate.update("UPDATE production_lines SET capacity = ? WHERE id = ?",
                productionLine.getCapacity(), productionLine.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM production_lines WHERE id = ?", id);
    }
}
