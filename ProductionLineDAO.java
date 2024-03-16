package com.lakshay.dao;
import com.lakshay.model.ProductionLine;
import java.util.List;
public interface ProductionLineDAO {
    ProductionLine getById(Long id);
    List<ProductionLine> getAll();
    void save(ProductionLine productionLine);
    void update(ProductionLine productionLine);
    void delete(Long id);
}
