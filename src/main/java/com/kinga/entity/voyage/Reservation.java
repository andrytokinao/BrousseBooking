package com.kinga.entity.voyage;

import com.kinga.entity.personne.Address;
import com.kinga.entity.personne.Personne;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer codeReservation;
    private Long idCoordoneDepart;
    private Long getIdCoordoneArrive;
    private int xPlace;
    private int yPlace;
    @ManyToOne
    private Personne passager;
    @ManyToOne
    private Voyage voyage;
    private String numeroPayement;
    

}
