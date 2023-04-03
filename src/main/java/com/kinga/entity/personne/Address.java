package com.kinga.entity.personne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String telephone;
    private String email;
    private String ville;
    private String address;
    private String commune;
    private String discrict;
    double Latitude ;
    double Longitude ;
    private Long idCoordone;
}
