package com.kinga.entity.voyage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("ANNULE")
@Data
@NoArgsConstructor
public class ReservationCanced extends ReservationStage {
    private String cause;
}
