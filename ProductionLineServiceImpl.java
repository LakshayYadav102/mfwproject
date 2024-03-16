package com.lakshay.service.imp;
import com.lakshay.model.ProductionLine;
import com.lakshay.service.ProductionLineService;
import com.lakshay.dao.ProductionLineDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionLineServiceImpl implements ProductionLineService {

 @Autowired
 private ProductionLineDAO productionLineDAO;

 @Override
 public List<ProductionLine> getAll() {
     return productionLineDAO.getAll();
 }

 @Override
 public ProductionLine getById(Long id) {
     return productionLineDAO.getById(id);
 }

 @Override
 public void save(ProductionLine productionLine) {
     productionLineDAO.save(productionLine);
 }

 @Override
 public void update(ProductionLine productionLine) {
     productionLineDAO.update(productionLine);
 }

 @Override
 public void delete(Long id) {
     productionLineDAO.delete(id);
 }
}
