package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.MiddlemanEntity;
import org.example.repository.MiddlemanRepository;
import org.example.service.MiddlemanService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MiddlemanServiceImpl implements MiddlemanService {
    public final MiddlemanRepository middlemanRepository;
    @Override
    public List<MiddlemanEntity> getAllMiddlemen() {
        return middlemanRepository.findAll();
    }

    @Override
    public MiddlemanEntity getMiddlemanById(Long id) {
        return middlemanRepository.findById(id).orElse(null);
    }

    @Override
    public MiddlemanEntity saveMiddleman(MiddlemanEntity middleman) {
        return middlemanRepository.save(middleman);
    }

    @Override
    public void deleteMiddleman(Long id) {
        middlemanRepository.deleteById(id);
    }
}
