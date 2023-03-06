package it.corso.mygym.model.dto;

import it.corso.mygym.model.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class SubscriptionDto {
    private Long id;
    private LocalDate startSubscription;
    private LocalDate endSubscription;
    private Double fee;
    private Boolean paid;
    private Type type;
}
