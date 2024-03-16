package com.lakshay.dao;
import com.lakshay.model.Worker;

import java.util.List;

public interface WorkerDAO {
    Worker getById(Long id);
    List<Worker> getAll();
    void save(Worker worker);
    void update(Worker worker);
    void delete(Long id);
}
