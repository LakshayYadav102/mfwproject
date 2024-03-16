// ProductionLineService.java
package com.lakshay.service;

import com.lakshay.model.ProductionLine;

import java.util.List;

public interface ProductionLineService {
    List<ProductionLine> getAll();
    ProductionLine getById(Long id);
    void save(ProductionLine productionLine);
    void update(ProductionLine productionLine);
    void delete(Long id);
}
