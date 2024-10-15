package org.example.service;

import org.example.dto.Farmer;
import org.example.entity.FarmerEntity;

import java.util.List;

public interface FarmerService {

    List<FarmerEntity> getFarmers();

    boolean addFarmer(Farmer farmer);

    void deleteById(Long id);

    Farmer findByUserName(String username);

    Boolean isExistUser(String userName);
}
