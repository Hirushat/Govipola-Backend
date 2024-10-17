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
