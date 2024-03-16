package com.lakshay.dao;
import com.lakshay.model.Equipment;

import java.util.List;

public interface EquipmentDAO {
    Equipment getById(Long id);
    List<Equipment> getAll();
    void save(Equipment equipment);
    void update(Equipment equipment);
    void delete(Long id);
}
