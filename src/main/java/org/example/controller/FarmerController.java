package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Farmer;
import org.example.entity.FarmerEntity;
import org.example.service.FarmerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
@RequiredArgsConstructor
@CrossOrigin
public class FarmerController {

    private final FarmerService farmerService;

    @GetMapping("/get-all")
    public List<FarmerEntity> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @GetMapping("get-by-id/{id}")
    public Farmer getFarmerById(@PathVariable Long id) {
        return farmerService.getFarmerById(id);
    }

    @GetMapping("get-by-username/{username}")
    public Farmer getFarmerByUsername(@PathVariable String username) {
        return farmerService.getFarmerByUserName(username);
    }

    @PostMapping("/add")
    public boolean createFarmer(@RequestBody Farmer farmer) {
        return farmerService.saveFarmer(farmer);
    }

    @PutMapping("/update/{id}")
    public boolean updateFarmer(@PathVariable Long id, @RequestBody Farmer farmer) {
        Farmer existingFarmer = farmerService.getFarmerById(id);
        if (existingFarmer != null) {
            existingFarmer.setName(farmer.getName());
            existingFarmer.setPhoneNumber(farmer.getPhoneNumber());
            existingFarmer.setAddress(farmer.getAddress());
            existingFarmer.setDivisionName(farmer.getDivisionName());
            existingFarmer.setStockInKg(farmer.getStockInKg());
            existingFarmer.setPassWord(farmer.getPassWord());
            existingFarmer.setCity(farmer.getCity());
            return farmerService.saveFarmer(existingFarmer);
        } else {
            return false;
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
    }
}
