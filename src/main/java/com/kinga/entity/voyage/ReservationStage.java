package com.kinga.entity.voyage;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@Data
@NoArgsConstructor
public class ReservationStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Reservation reservation;
    private Long idCoordone;
    EtatEnum etat;


}
