package com.kinga.entity.voyage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("ARRIVEE")
@Data
@NoArgsConstructor
public class ReservationArrival extends ReservationStage {
}
