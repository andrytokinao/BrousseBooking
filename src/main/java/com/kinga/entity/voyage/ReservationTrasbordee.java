package com.kinga.entity.voyage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("TRANSBORDEE")
@Data
@NoArgsConstructor
public class ReservationTrasbordee {
    @ManyToOne
    private Reservation reservationTransbordee;
}
