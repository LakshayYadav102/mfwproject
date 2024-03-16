package com.lakshay.Imp;

import com.lakshay.model.Order;
import com.lakshay.dao.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Order getById(Long id) {
        return jdbcTemplate.queryForObject(
            "SELECT * FROM orders WHERE id = ?", 
            new BeanPropertyRowMapper<>(Order.class),
            id
        );
    }

    @Override
    public List<Order> getAll() {
        return jdbcTemplate.query("SELECT * FROM orders", new BeanPropertyRowMapper<>(Order.class));
    }

    @Override
    public void save(Order order) {
        jdbcTemplate.update("INSERT INTO orders (id, deliver_date, ordered, quantity, car_model) VALUES (?, ?, ?, ?, ?)",
                order.getId(), order.getDeliverDate(), order.isOrdered(), order.getQuantity(), order.getCarModel());
    }

    @Override
    public void update(Order order) {
        jdbcTemplate.update("UPDATE orders SET deliver_date = ?, ordered = ?, quantity = ?, car_model = ? WHERE id = ?",
                order.getDeliverDate(), order.isOrdered(), order.getQuantity(), order.getCarModel(), order.getId());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM orders WHERE id = ?", id);
    }
}
