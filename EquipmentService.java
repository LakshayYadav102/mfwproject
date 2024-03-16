package com.lakshay.service;
import com.lakshay.model.Equipment;
import java.util.List;
public interface EquipmentService {
    Equipment getById(Long id);
    List<Equipment> getAll();
    void save(Equipment equipment);
    void update(Equipment equipment);
    void delete(Long id);
}

