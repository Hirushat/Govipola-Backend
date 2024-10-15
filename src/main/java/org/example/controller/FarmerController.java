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
public class FarmerController {
    final FarmerService service;

    @GetMapping("/get-all-farmers")
    public List<FarmerEntity> getFarmers(){
        return service.getFarmers();
    }

    @PostMapping("/add-farmer")
    public boolean addFarmer(@RequestBody Farmer farmer){

        return service.addFarmer(farmer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFarmer(@PathVariable Long id){
        service.deleteById(id);
    }
    @GetMapping("/find-by-username/{username}")
    public Farmer findUserByUsername(@PathVariable String username){
        return service.findByUserName(username);
    }
    @GetMapping("/is-exist-user/{userName}")
    public Boolean isExistUser(@PathVariable String userName){
        return service.isExistUser(userName);
    }





}

