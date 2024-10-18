package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.RiceStock;
import org.example.entity.RiceStockEntity;
import org.example.service.RiceStockService;
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

}
