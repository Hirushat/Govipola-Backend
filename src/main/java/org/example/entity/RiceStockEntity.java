package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dto.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ricestock_entity")
public class RiceStockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user; // Owner of the rice stock (Farmer or Middleman)

    private String riceType;
    private Double quantityKg;
    private Double pricePerKg;
}
