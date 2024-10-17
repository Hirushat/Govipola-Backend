package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.FarmerEntity;
import org.example.repository.FarmerRepository;
import org.example.service.FarmerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FarmerServiceImpl implements FarmerService {

    private final FarmerRepository farmerRepository;

    @Override
    public List<FarmerEntity> getAllFarmers() {
        return  farmerRepository.findAll();
    }

    @Override
    public FarmerEntity getFarmerById(Long id) {
        return farmerRepository.findById(id).orElse(null);
    }

    @Override
    public FarmerEntity saveFarmer(FarmerEntity farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}
