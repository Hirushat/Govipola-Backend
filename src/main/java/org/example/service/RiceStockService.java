package org.example.service;

import org.example.dto.RiceStock;
import org.example.entity.RiceStockEntity;

import java.util.List;

public interface RiceStockService {
    public boolean addRiceStock(RiceStock riceStock, String username);

    public List<RiceStockEntity> getRiceStocksByUser(Long userId);
    public boolean updateRiceStock(Long stockId, RiceStockEntity riceStock);

}
