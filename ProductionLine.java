package com.lakshay.model;

public class ProductionLine {
    private Long id;
    private int capacity;

    // Constructors
    public ProductionLine() {
    }

    public ProductionLine(Long id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Other properties, constructors, getters, setters as needed
}
