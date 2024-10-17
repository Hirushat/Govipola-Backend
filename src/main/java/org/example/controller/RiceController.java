package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.FarmerEntity;
import org.example.entity.RiceEntity;
import org.example.service.RiceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/rice")
@RequiredArgsConstructor
@CrossOrigin
public class RiceController {

    private final RiceService riceService;

    @GetMapping
    public List<RiceEntity> getAllRice() {
        return riceService.getAllRice();
    }

    @GetMapping("byid/{id}")
    public RiceEntity getRiceById(@PathVariable Long id) {
        return riceService.getRiceById(id);
    }

    @PostMapping("/add")
    public RiceEntity createRice(@RequestBody RiceEntity rice) {
        return riceService.saveRice(rice);
    }

    @PutMapping("update/{id}")
    public RiceEntity updateRice(@PathVariable Long id, @RequestBody RiceEntity rice) {
        RiceEntity existingRice = riceService.getRiceById(id);
        if (existingRice != null) {
            existingRice.setType(rice.getType());
            existingRice.setFarmer(rice.getFarmer());
            existingRice.setMiddleman(rice.getMiddleman());
            existingRice.setMiller(rice.getMiller());
            return riceService.saveRice(existingRice);
        } else {
            return null;
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteRice(@PathVariable Long id) {
        riceService.deleteRice(id);
    }

    @GetMapping("/type/{riceType}")
    public Optional<RiceEntity> getRiceByFarmerAndType(@RequestBody FarmerEntity farmer, @PathVariable String riceType) {
        return riceService.findRiceByFarmerAndType(farmer, riceType);
    }

    @GetMapping("/details")
    public ResponseEntity<Map<String, List<Object[]>>> getRiceDetailsByType(@RequestParam String type) {
        return ResponseEntity.ok(riceService.getRiceDetailsByType(type));
    }
}
