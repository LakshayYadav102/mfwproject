package com.lakshay.controller;

import com.lakshay.model.Worker;
import com.lakshay.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping
    public List<Worker> getAllWorkers() {
        return workerService.getAll();
    }

    @GetMapping("/{id}")
    public Worker getWorkerById(@PathVariable Long id) {
        return workerService.getById(id);
    }

    @PostMapping
    public void addWorker(@RequestBody Worker worker) {
        workerService.save(worker);
    }

    @PutMapping("/{id}")
    public void updateWorker(@RequestBody Worker worker, @PathVariable Long id) {
        worker.setId(id); // Ensure the ID is set from the path variable
        workerService.update(worker);
    }

    @DeleteMapping("/{id}")
    public void deleteWorker(@PathVariable Long id) {
        workerService.delete(id);
    }
}
