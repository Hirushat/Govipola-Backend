package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MiddlemanEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long middlemanID;

    private String name;
    private String userName;
    private String address;
    private String phoneNumber;
    private String city;
    private String divisionName;
    private String passWord;
    private Float stockInKg;

    @OneToMany(mappedBy = "middleman")
    private List<RiceEntity> riceEntities;
}
