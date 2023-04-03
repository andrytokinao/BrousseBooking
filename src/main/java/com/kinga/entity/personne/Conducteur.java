package com.kinga.entity.personne;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Conducteur  extends Personne {
    private String numeroPermi;
}
