package org.example.service;

import org.example.dto.RiceStock;
import org.example.entity.RiceStockEntity;

import java.util.List;

public interface RiceStockService {
    boolean addRiceStock(RiceStock riceStock, String username);

    List<RiceStockEntity> getRiceStocksByUser(Long userId);
    boolean updateRiceStock(Long stockId, RiceStockEntity riceStock);

    void deleteRiceStock(Long id);
}
