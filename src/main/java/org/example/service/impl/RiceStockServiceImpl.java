package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.RiceStock;
import org.example.entity.RiceStockEntity;
import org.example.repository.RiceStockRepository;
import org.example.repository.UserRepository;
import org.example.service.RiceStockService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiceStockServiceImpl implements RiceStockService {
    private final RiceStockRepository riceStockRepository;
    private final UserRepository userRepository;
    private final ModelMapper mapper;


    @Override
    public boolean addRiceStock(RiceStock riceStock, String username) {
        if (riceStock != null && username != null) {
            RiceStockEntity entity = mapper.map(riceStock, RiceStockEntity.class);
            entity.setUser(userRepository.findByUserName(username));
            riceStockRepository.save(entity);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<RiceStockEntity> getRiceStocksByUser(Long userId) {
        if (userId != null) {
            return riceStockRepository.findAllByUserId(userId);// You can define a query method for this
        }else{
            return null;
        }

    }
}