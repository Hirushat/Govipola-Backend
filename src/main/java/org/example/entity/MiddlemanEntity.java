package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
