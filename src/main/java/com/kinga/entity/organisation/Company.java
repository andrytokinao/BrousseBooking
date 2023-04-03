package com.kinga.entity.organisation;

import com.kinga.entity.personne.Address;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String name;
    @OneToOne
    private Address address;
    private String nif;
    private String stat;
    private String dateCreation;
    @OneToMany
    private List<CompanyVehicle> companyVehicles;

}
