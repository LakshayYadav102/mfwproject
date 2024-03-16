package com.lakshay.service.imp;
import com.lakshay.dao.WorkerDAO;
import com.lakshay.model.Worker;
import com.lakshay.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerDAO workerDAO;

    @Override
    public Worker getById(Long id) {
        return workerDAO.getById(id);
    }

    @Override
    public List<Worker> getAll() {
        return workerDAO.getAll();
    }

    @Override
    public void save(Worker worker) {
        workerDAO.save(worker);
    }

    @Override
    public void update(Worker worker) {
        workerDAO.update(worker);
    }

    @Override
    public void delete(Long id) {
        workerDAO.delete(id);
    }
}
