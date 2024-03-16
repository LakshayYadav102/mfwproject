package com.lakshay.service.imp;
import com.lakshay.dao.EquipmentDAO;
import com.lakshay.model.Equipment;
import com.lakshay.service.EquipmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentDAO equipmentDAO;

    @Override
    public Equipment getById(Long id) {
        return equipmentDAO.getById(id);
    }

    @Override
    public List<Equipment> getAll() {
        return equipmentDAO.getAll();
    }

    @Override
    public void save(Equipment equipment) {
        equipmentDAO.save(equipment);
    }

    @Override
    public void update(Equipment equipment) {
        equipmentDAO.update(equipment);
    }

    @Override
    public void delete(Long id) {
        equipmentDAO.delete(id);
    }
}
