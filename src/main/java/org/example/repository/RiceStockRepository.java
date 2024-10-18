package org.example.repository;

import org.example.entity.RiceStockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiceStockRepository extends JpaRepository<RiceStockEntity, Long> {
    List<RiceStockEntity> findAllByUserId(Long userId);
}

