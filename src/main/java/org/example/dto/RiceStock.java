package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiceStock {
    private User user; // Owner of the rice stock (Farmer or Middleman)
    private String riceType;
    private Double quantityKg;
    private Double pricePerKg;
}
