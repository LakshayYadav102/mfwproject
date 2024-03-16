package com.lakshay.model;

public class Worker {
    private Long id;
    private String name;
    private String contactInfo;
    private String role;

    // Constructors
    public Worker() {
    }

    public Worker(Long id, String name, String contactInfo, String role) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.role = role;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
