package com.kinga.entity.personne;

import com.kinga.entity.personne.Personne;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Responsable extends Personne {
    String numeroResponsable;
}
