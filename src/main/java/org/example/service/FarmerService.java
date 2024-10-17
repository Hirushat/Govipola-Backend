package org.example.service;

import org.example.entity.FarmerEntity;

import java.util.List;

public interface FarmerService {
    public List<FarmerEntity> getAllFarmers();

    public FarmerEntity getFarmerById(Long id);

    public FarmerEntity saveFarmer(FarmerEntity farmer);

    public void deleteFarmer(Long id);
}
