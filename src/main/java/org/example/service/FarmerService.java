package org.example.service;

import org.example.dto.Farmer;
import org.example.entity.FarmerEntity;

import java.util.List;

public interface FarmerService {
    public List<FarmerEntity> getAllFarmers();

    public Farmer getFarmerById(Long id);

    public Farmer getFarmerByUserName(String username);

    public boolean saveFarmer(Farmer farmer);

    public void deleteFarmer(Long id);
}
