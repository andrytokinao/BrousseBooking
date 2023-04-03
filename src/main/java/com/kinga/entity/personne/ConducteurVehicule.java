package com.kinga.entity.personne;

import com.kinga.entity.organisation.Company;
import com.kinga.entity.organisation.Vehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ConducteurVehicule {
    private Long id;
    @ManyToOne
    private Conducteur conducteur;
    @ManyToOne
    private Company company;
    @ManyToOne
    private Vehicle vehicle;

}
