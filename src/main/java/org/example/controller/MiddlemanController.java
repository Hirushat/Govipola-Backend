package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Middleman;
import org.example.entity.MiddlemanEntity;
import org.example.service.MiddlemanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/middleman")
@RequiredArgsConstructor
@CrossOrigin
public class MiddlemanController {

    private final MiddlemanService middlemanService;

    @GetMapping("/get-all")
    public List<MiddlemanEntity> getAllMiddlemen() {
        return middlemanService.getAllMiddlemen();
    }

    @GetMapping("byid/{id}")
    public Middleman getMiddlemanById(@PathVariable Long id) {
        return middlemanService.getMiddlemanById(id);
    }

    @PostMapping("/add")
    public boolean createMiddleman(@RequestBody Middleman middleman) {
        return middlemanService.saveMiddleman(middleman);
    }

    @PutMapping("/update/{id}")
    public boolean updateMiddleman(@PathVariable Long id, @RequestBody MiddlemanEntity middleman) {
        Middleman existingMiddleman = middlemanService.getMiddlemanById(id);
        if (existingMiddleman != null) {
            existingMiddleman.setName(middleman.getName());
            existingMiddleman.setUserName(middleman.getUserName());
            existingMiddleman.setPhoneNumber(middleman.getPhoneNumber());
            existingMiddleman.setAddress(middleman.getAddress());
            existingMiddleman.setDivisionName(middleman.getDivisionName());
            existingMiddleman.setStockInKg(middleman.getStockInKg());
            existingMiddleman.setPassWord(middleman.getPassWord());
            existingMiddleman.setCity(middleman.getCity());
            return middlemanService.saveMiddleman(existingMiddleman);
        } else {
            return false;
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteMiddleman(@PathVariable Long id) {
        middlemanService.deleteMiddleman(id);
    }
}
