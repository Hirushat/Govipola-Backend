package org.example.repository;

import org.example.entity.FarmerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<FarmerEntity, Long>{
    FarmerEntity findByUserName(String userName);
    Boolean existsByUserName(String userName);
}
