package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.FarmerEntity;
import org.example.entity.RiceEntity;
import org.example.repository.RiceRepository;
import org.example.service.RiceService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RiceServiceImpl implements RiceService {

    private final RiceRepository riceRepository;

    public List<RiceEntity> getAllRice() {
        return riceRepository.findAll();
    }

    public RiceEntity getRiceById(Long id) {
        return riceRepository.findById(id).orElse(null);
    }

    public RiceEntity saveRice(RiceEntity rice) {
        return riceRepository.save(rice);
    }

    public void deleteRice(Long id) {
        riceRepository.deleteById(id);
    }

    @Override
    public Optional<RiceEntity> findRiceByFarmerAndType(FarmerEntity farmer, String type) {
        return riceRepository.findRiceByFarmerAndType(farmer, type);
    }

    public Map<String, List<Object[]>> getRiceDetailsByType(String type) {
        List<Object[]> farmerPrices = riceRepository.getFarmerPricesByRiceType(type);
        List<Object[]> middlemanPrices = riceRepository.getMiddlemanPricesByRiceType(type);
        List<Object[]> millerPrices = riceRepository.getMillerPricesByRiceType(type);

        Map<String, List<Object[]>> riceDetailsByType = new HashMap<>();
        riceDetailsByType.put("Farmers", farmerPrices);
        riceDetailsByType.put("Middlemen", middlemanPrices);
        riceDetailsByType.put("Millers", millerPrices);

        return riceDetailsByType;
    }
}
