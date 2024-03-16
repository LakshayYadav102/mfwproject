package com.lakshay.service;

import com.lakshay.model.Assignee;

import java.util.List;

public interface AssigneeService {
    List<Assignee> getAll();
    Assignee getById(Long id);
    void save(Assignee assignee);
    void update(Assignee assignee);
    void delete(Long id);
}
