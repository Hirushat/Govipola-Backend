package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Farmer;
import org.example.entity.FarmerEntity;
import org.example.repository.FarmerRepository;
import org.example.service.FarmerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FarmerServiceImpl implements FarmerService {
    private final FarmerRepository repository;
    final ModelMapper mapper;


    @Override
    public List<FarmerEntity> getFarmers() {
        return List.of();
    }

    @Override
    public boolean addFarmer(Farmer farmer) {
        if (farmer != null) {
            repository.save(mapper.map(farmer, FarmerEntity.class));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Farmer findByUserName(String userName) {
        return mapper.map(repository.findByUserName(userName), Farmer.class);
    }

    @Override
    public Boolean isExistUser(String userName) {
        return repository.existsByUserName(userName);
    }
}
