package com.kinga.entity.personne;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Client extends Personne {
    private String numeroClient;

}
