package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.RiceTypesEntity;
import org.example.service.RiceTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ricetypes")
@RequiredArgsConstructor
@CrossOrigin
public class RiceTypesController {

    private RiceTypeService riceTypesService;

    @GetMapping("/get-all")
    public List<RiceTypesEntity> getAllRiceTypes() {
        return riceTypesService.getAllRiceTypes();
    }

    @GetMapping("/byid/{id}")
    public RiceTypesEntity getRiceTypeById(@PathVariable Long id) {
        return riceTypesService.getRiceTypeById(id);
    }

    @PostMapping("/add")
    public RiceTypesEntity createRiceType(@RequestBody RiceTypesEntity riceType) {
        return riceTypesService.saveRiceType(riceType);
    }

    @PutMapping("update/{id}")
    public RiceTypesEntity updateRiceType(@PathVariable Long id, @RequestBody RiceTypesEntity riceType) {
        RiceTypesEntity existingRiceType = riceTypesService.getRiceTypeById(id);
        if (existingRiceType != null) {
            existingRiceType.setType(riceType.getType());
            return riceTypesService.saveRiceType(existingRiceType);
        } else {
            return null;
        }
    }

    @DeleteMapping("delete/{id}")
    public void deleteRiceType(@PathVariable Long id) {
        riceTypesService.deleteRiceType(id);
    }
}
