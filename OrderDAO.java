package com.lakshay.dao;
import com.lakshay.model.Order;
import java.util.List;

public interface OrderDAO {
    Order getById(Long id);

    List<Order> getAll();

    void save(Order order);

    void update(Order order);

    void delete(Long id);
}

