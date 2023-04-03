package com.kinga.entity.voyage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PRENDRE")
@Data
@NoArgsConstructor
public class ReservationTaked {
}
