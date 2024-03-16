package com.lakshay.controller;

import com.lakshay.model.Assignee;
import com.lakshay.service.AssigneeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignees")
public class AssigneeController {

    @Autowired
    private AssigneeService assigneeService;

    @GetMapping
    public List<Assignee> getAllAssignees() {
        return assigneeService.getAll();
    }

    @GetMapping("/{id}")
    public Assignee getAssigneeById(@PathVariable Long id) {
        return assigneeService.getById(id);
    }

    @PostMapping
    public void addAssignee(@RequestBody Assignee assignee) {
        assigneeService.save(assignee);
    }

    @PutMapping("/{id}")
    public void updateAssignee(@RequestBody Assignee assignee, @PathVariable Long id) {
        assignee.setId(id); // Ensure the ID is set from the path variable
        assigneeService.update(assignee);
    }

    @DeleteMapping("/{id}")
    public void deleteAssignee(@PathVariable Long id) {
        assigneeService.delete(id);
    }
}
