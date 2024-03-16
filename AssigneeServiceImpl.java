package com.lakshay.service.imp;
import com.lakshay.model.Assignee;
import com.lakshay.service.AssigneeService;
import com.lakshay.dao.AssigneeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

 @Autowired
 private AssigneeDAO assigneeDAO;

 @Override
 public List<Assignee> getAll() {
     return assigneeDAO.getAll();
 }

 @Override
 public Assignee getById(Long id) {
     return assigneeDAO.getById(id);
 }

 @Override
 public void save(Assignee assignee) {
     assigneeDAO.save(assignee);
 }

 @Override
 public void update(Assignee assignee) {
     assigneeDAO.update(assignee);
 }

 @Override
 public void delete(Long id) {
     assigneeDAO.delete(id);
 }
}
