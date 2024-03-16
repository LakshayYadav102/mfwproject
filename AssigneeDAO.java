package com.lakshay.dao;
import com.lakshay.model.Assignee;

import java.util.List;

public interface AssigneeDAO {
    Assignee getById(Long id);
    List<Assignee> getAll();
    void save(Assignee assignee);
    void update(Assignee assignee);
    void delete(Long id);
}
