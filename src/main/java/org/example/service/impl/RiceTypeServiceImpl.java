package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.RiceTypesEntity;
import org.example.repository.RiceTypesRepository;
import org.example.service.RiceTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiceTypeServiceImpl implements RiceTypeService {

    private final RiceTypesRepository riceTypesRepository;

    public List<RiceTypesEntity> getAllRiceTypes() {
        return riceTypesRepository.findAll();
    }

    public RiceTypesEntity getRiceTypeById(Long id) {
        return riceTypesRepository.findById(id).orElse(null);
    }

    public RiceTypesEntity saveRiceType(RiceTypesEntity riceType) {
        return riceTypesRepository.save(riceType);
    }

    public void deleteRiceType(Long id) {
        riceTypesRepository.deleteById(id);
    }
}
