package com.lakshay.service.imp;

import com.lakshay.dao.OrderDAO;
import com.lakshay.model.Order;
import com.lakshay.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public Order getOrderById(Long id) {
        return orderDAO.getById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderDAO.getAll();
    }

    @Override
    public void createOrder(Order order) {
        orderDAO.save(order);
    }

    @Override
    public void updateOrder(Order order) {
        orderDAO.update(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderDAO.delete(id);
    }
}
