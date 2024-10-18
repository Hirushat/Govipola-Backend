package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Middleman;
import org.example.dto.Miller;
import org.example.entity.MiddlemanEntity;
import org.example.entity.MillerEntity;
import org.example.repository.MillerRepository;
import org.example.service.MillerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MillerServiceImpl implements MillerService{
    private final MillerRepository millerRepository;
    final ModelMapper mapper;

    @Override
    public List<MillerEntity> getAllMillers() {
        return millerRepository.findAll();
    }

    @Override
    public Miller getMillerById(Long id) {
        Optional<MillerEntity> byId = millerRepository.findById(id);

        return mapper.map( byId, Miller.class);
    }

    @Override
    public boolean saveMiller(Miller miller) {
        if (miller != null) {
            millerRepository.save(mapper.map(miller, MillerEntity.class));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void deleteMiller(Long id) {

    }
}
