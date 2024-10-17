package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rice {
    private String type;
    private Farmer farmer;
    private Middleman middleman;
    private Miller miller;
}
