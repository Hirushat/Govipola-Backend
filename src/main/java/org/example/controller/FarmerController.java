package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.FarmerEntity;
import org.example.service.FarmerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmer")
@RequiredArgsConstructor
@CrossOrigin
public class FarmerController {

    private FarmerService farmerService;

    @GetMapping("/get-all")
    public List<FarmerEntity> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @GetMapping("get/{id}")
    public FarmerEntity getFarmerById(@PathVariable Long id) {
        return farmerService.getFarmerById(id);
    }

    @PostMapping("/add")
    public FarmerEntity createFarmer(@RequestBody FarmerEntity farmer) {
        return farmerService.saveFarmer(farmer);
    }

    @PutMapping("/update/{id}")
    public FarmerEntity updateFarmer(@PathVariable Long id, @RequestBody FarmerEntity farmer) {
        FarmerEntity existingFarmer = farmerService.getFarmerById(id);
        if (existingFarmer != null) {
            existingFarmer.setName(farmer.getName());
            existingFarmer.setUserName(farmer.getUserName());
            existingFarmer.setPhoneNumber(farmer.getPhoneNumber());
            existingFarmer.setAddress(farmer.getAddress());
            existingFarmer.setDivisionName(farmer.getDivisionName());
            existingFarmer.setStockInKg(farmer.getStockInKg());
            existingFarmer.setPassWord(farmer.getPassWord());
            existingFarmer.setCity(farmer.getCity());
            return farmerService.saveFarmer(existingFarmer);
        } else {
            return null;
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
    }
}
