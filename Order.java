package com.lakshay.model;

import java.util.Date;

public class Order {
    private Long id;
    private Date deliverDate;
    private boolean ordered;
    private int quantity;
    private String carModel;

    // Constructors
    public Order() {
    }

    public Order(Long id, Date deliverDate, boolean ordered, int quantity, String carModel) {
        this.id = id;
        this.deliverDate = deliverDate;
        this.ordered = ordered;
        this.quantity = quantity;
        this.carModel = carModel;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Other methods as needed
}
