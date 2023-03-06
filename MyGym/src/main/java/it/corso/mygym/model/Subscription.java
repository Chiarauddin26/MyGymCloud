package it.corso.mygym.model;

import it.corso.mygym.model.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name =  "subscription" )
@Getter
@Setter
@NoArgsConstructor
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startSubscription;
    private LocalDate endSubscription;
    private Double fee;
    @NotNull
    private Boolean paid;
    @Column(name = "type")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "gym_id")
    private Gym gym;

}
