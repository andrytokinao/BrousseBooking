package com.kinga.entity.organisation;

import com.kinga.entity.DocumentFichier;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String matricule;
    private String maque;
    @ManyToOne
    private Company company;
    @ManyToMany
    private List<DocumentFichier> documentFichiers;
    @OneToMany
    private List<CompanyVehicle> companyVehicles;

}
