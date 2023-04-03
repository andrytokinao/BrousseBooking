package com.kinga.entity.personne;

import com.kinga.entity.organisation.Company;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Fonction {
    private Integer id;
    private Personne personne;
    private String type;
    private Company company;
    private String numeroFonction;
}
