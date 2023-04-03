package com.kinga.entity.voyage;

import com.kinga.entity.organisation.Vehicle;
import com.kinga.entity.personne.Conducteur;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<Reservation> reservations;
    private Integer numeroVoyage;
    @ManyToOne
    private Stationnement stationnementDepart;
    @ManyToOne
    private Stationnement arriveeArriee;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private Conducteur conducteur;
    private Date dateDepart;
    private Date dateArrivee;
    private boolean ouvert ;
    private double pricing;

}
