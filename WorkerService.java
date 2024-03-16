package com.lakshay.service;
import com.lakshay.model.Worker;

import java.util.List;

public interface WorkerService {
    Worker getById(Long id);
    List<Worker> getAll();
    void save(Worker worker);
    void update(Worker worker);
    void delete(Long id);
}
