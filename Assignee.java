package com.lakshay.model;
public class Assignee {
    private Long id;
    private Long workerId;

    // Constructors
    public Assignee() {
    }

    public Assignee(Long id, Long workerId) {
        this.id = id;
        this.workerId = workerId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    // Other properties, if any
}

