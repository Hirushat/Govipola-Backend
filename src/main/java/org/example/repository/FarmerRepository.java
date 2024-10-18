package org.example.repository;

import org.example.entity.FarmerEntity;
import org.example.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<FarmerEntity, Long> {
    FarmerEntity findByUserName(String userName);
}
