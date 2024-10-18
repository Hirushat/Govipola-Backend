package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Farmer;
import org.example.entity.FarmerEntity;
import org.example.entity.UserEntity;
import org.example.repository.FarmerRepository;
import org.example.service.FarmerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FarmerServiceImpl implements FarmerService {

    private final FarmerRepository farmerRepository;

    final ModelMapper mapper;

    @Override
    public List<FarmerEntity> getAllFarmers() {
        return  farmerRepository.findAll();
    }

    @Override
    public Farmer getFarmerById(Long id) {
        Optional<FarmerEntity> byId = farmerRepository.findById(id);

        return mapper.map( byId, Farmer.class);
    }

    @Override
    public Farmer getFarmerByUserName(String username) {
        FarmerEntity byUserName = farmerRepository.findByUserName(username);
        return mapper.map(byUserName, Farmer.class);
    }

    @Override
    public boolean saveFarmer(Farmer farmer) {
        if (farmer != null) {
            farmerRepository.save(mapper.map(farmer, FarmerEntity.class));
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void deleteFarmer(Long id) {
        farmerRepository.deleteById(id);
    }
}
