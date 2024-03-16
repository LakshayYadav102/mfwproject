package com.lakshay.controller;

import com.lakshay.model.ProductionLine;
import com.lakshay.service.ProductionLineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/production-lines")
public class ProductionLineController {

    @Autowired
    private ProductionLineService productionLineService;

    @GetMapping
    public List<ProductionLine> getAllProductionLines() {
        return productionLineService.getAll();
    }

    @GetMapping("/{id}")
    public ProductionLine getProductionLineById(@PathVariable Long id) {
        return productionLineService.getById(id);
    }

    @PostMapping
    public void addProductionLine(@RequestBody ProductionLine productionLine) {
        productionLineService.save(productionLine);
    }

    @PutMapping("/{id}")
    public void updateProductionLine(@RequestBody ProductionLine productionLine, @PathVariable Long id) {
        productionLine.setId(id); // Ensure the ID is set from the path variable
        productionLineService.update(productionLine);
    }

    @DeleteMapping("/{id}")
    public void deleteProductionLine(@PathVariable Long id) {
        productionLineService.delete(id);
    }
}
