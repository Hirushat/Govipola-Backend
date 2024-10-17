package org.example.service;

import org.example.entity.FarmerEntity;
import org.example.entity.RiceEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface RiceService {
    public List<RiceEntity> getAllRice();

    public RiceEntity getRiceById(Long id);

    public RiceEntity saveRice(RiceEntity rice);

    public void deleteRice(Long id);

    public Optional<RiceEntity> findRiceByFarmerAndType(FarmerEntity farmer, String type) ;

    public Map<String, List<Object[]>> getRiceDetailsByType(String type);
}
