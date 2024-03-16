package com.lakshay.controller;

import com.lakshay.model.Equipment;
import com.lakshay.service.EquipmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @GetMapping
    public List<Equipment> getAllEquipment() {
        return equipmentService.getAll();
    }

    @GetMapping("/{id}")
    public Equipment getEquipmentById(@PathVariable Long id) {
        return equipmentService.getById(id);
    }

    @PostMapping
    public void addEquipment(@RequestBody Equipment equipment) {
        equipmentService.save(equipment);
    }

    @PutMapping("/{id}")
    public void updateEquipment(@RequestBody Equipment equipment, @PathVariable Long id) {
        equipment.setId(id); // Ensure the ID is set from the path variable
        equipmentService.update(equipment);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipment(@PathVariable Long id) {
        equipmentService.delete(id);
    }
}
