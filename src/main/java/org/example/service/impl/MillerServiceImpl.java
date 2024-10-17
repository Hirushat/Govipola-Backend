package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.MillerEntity;
import org.example.repository.MillerRepository;
import org.example.service.MillerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MillerServiceImpl implements MillerService{
    private final MillerRepository millerRepository;

    @Override
    public List<MillerEntity> getAllMillers() {
        return millerRepository.findAll();
    }

    @Override
    public MillerEntity getMillerById(Long id) {
        return millerRepository.findById(id).orElse(null);
    }

    @Override
    public MillerEntity saveMiller(MillerEntity miller) {
        return millerRepository.save(miller);
    }

    @Override
    public void deleteMiller(Long id) {

    }
}
