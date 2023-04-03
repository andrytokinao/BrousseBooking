package com.kinga.entity.voyage;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CHANGE_PLACE")
@Data
@NoArgsConstructor
public class ReservationcChangePlace extends ReservationStage {
    private int x;
    private int y;
}
