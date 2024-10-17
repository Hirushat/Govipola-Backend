package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.entity.MillerEntity;
import org.example.service.MillerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/miller")
@RequiredArgsConstructor
@CrossOrigin
public class MillerController {

    private final MillerService millerService;

    @GetMapping("/get-all")
    public List<MillerEntity> getAllMillers() {
        return millerService.getAllMillers();
    }

    @GetMapping("byid/{id}")
    public MillerEntity getMillerById(@PathVariable Long id) {
        return millerService.getMillerById(id);
    }

    @PostMapping("/add")
    public MillerEntity createMiller(@RequestBody MillerEntity miller) {
        return millerService.saveMiller(miller);
    }

    @PutMapping("update/{id}")
    public MillerEntity updateMiller(@PathVariable Long id, @RequestBody MillerEntity miller) {
        MillerEntity existingMiller = millerService.getMillerById(id);
        if (existingMiller != null) {
            existingMiller.setName(miller.getName());
            existingMiller.setUserName(miller.getUserName());
            existingMiller.setPhoneNumber(miller.getPhoneNumber());
            existingMiller.setAddress(miller.getAddress());
            existingMiller.setDivisionName(miller.getDivisionName());
            existingMiller.setStockInKg(miller.getStockInKg());
            existingMiller.setPassWord(miller.getPassWord());
            existingMiller.setCity(miller.getCity());
            return millerService.saveMiller(existingMiller);
        } else {
            return null;
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteMiller(@PathVariable Long id) {
        millerService.deleteMiller(id);
    }
}
