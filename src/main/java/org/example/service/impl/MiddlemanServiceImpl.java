package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Farmer;
import org.example.dto.Middleman;
import org.example.entity.FarmerEntity;
import org.example.entity.MiddlemanEntity;
import org.example.repository.MiddlemanRepository;
import org.example.service.MiddlemanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MiddlemanServiceImpl implements MiddlemanService {
    public final MiddlemanRepository middlemanRepository;
    final ModelMapper mapper;

    @Override
    public List<MiddlemanEntity> getAllMiddlemen() {
        return middlemanRepository.findAll();
    }

    @Override
    public Middleman getMiddlemanById(Long id) {

        Optional<MiddlemanEntity> byId = middlemanRepository.findById(id);

        return mapper.map( byId, Middleman.class);
    }

    @Override
    public boolean saveMiddleman(Middleman middleman) {
        if (middleman != null) {
            middlemanRepository.save(mapper.map(middleman, MiddlemanEntity.class));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void deleteMiddleman(Long id) {
        middlemanRepository.deleteById(id);
    }
}
