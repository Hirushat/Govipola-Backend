package org.example.service;

import org.example.entity.RiceTypesEntity;

import java.util.List;

public interface RiceTypeService {
    public List<RiceTypesEntity> getAllRiceTypes();

    public RiceTypesEntity getRiceTypeById(Long id);

    public RiceTypesEntity saveRiceType(RiceTypesEntity riceType);

    public void deleteRiceType(Long id) ;
}
