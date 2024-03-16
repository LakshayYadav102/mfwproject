package com.lakshay.service;

import com.lakshay.model.Order;

import java.util.List;

public interface OrderService {

    Order getOrderById(Long id);

    List<Order> getAllOrders();

    void createOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Long id);
}
