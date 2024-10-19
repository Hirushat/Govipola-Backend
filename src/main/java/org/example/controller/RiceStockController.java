package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.RiceStock;
import org.example.entity.RiceStockEntity;
import org.example.service.RiceStockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
@CrossOrigin
public class RiceStockController {

    private final RiceStockService riceStockService;

    @PostMapping("/add-ricestock/user/{username}")
    public boolean addRiceStock(@RequestBody RiceStock riceStock, @PathVariable String username) {

        return riceStockService.addRiceStock(riceStock, username);
    }

    @GetMapping("/{userId}")
    public List<RiceStockEntity> getRiceStocksByUser(@PathVariable Long userId) {
        return riceStockService.getRiceStocksByUser(userId);
    }

    // PUT request to update rice stock by stockId
    @PutMapping("/update/{stockId}")
    public ResponseEntity<String> updateRiceStock(@PathVariable Long stockId, @RequestBody RiceStockEntity riceStock) {
        boolean isUpdated = riceStockService.updateRiceStock(stockId, riceStock);

        if (isUpdated) {
            return ResponseEntity.ok("Rice stock updated successfully!");
        } else {
            return ResponseEntity.badRequest().body("Failed to update rice stock.");
        }
    }

}
