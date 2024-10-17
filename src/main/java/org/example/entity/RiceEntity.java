package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rice_entity")
public class RiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long riceID;

    private String type;

    // Price from Farmer
    @Column(name = "price_from_farmer")
    private Float priceFromFarmer;

    // Price from Middleman
    @Column(name = "price_from_middleman")
    private Float priceFromMiddleman;

    // Price from Miller
    @Column(name = "price_from_miller")
    private Float priceFromMiller;

    // Relationships to the respective entities
    @ManyToOne
    @JoinColumn(name = "farmerID")
    private FarmerEntity farmer;

    @ManyToOne
    @JoinColumn(name = "middlemanID")
    private MiddlemanEntity middleman;

    @ManyToOne
    @JoinColumn(name = "millerID")
    private MillerEntity miller;

}
