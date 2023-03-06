package it.corso.mygym.model;

import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user" )
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String name;
    @Column(length = 20)
    private String surname;
    @Column(unique = true)
    private String email;
    private LocalDate birthday;
    @NotNull
    private Boolean medicalCertificate;
    @NotNull
    private Boolean activated = true;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;

}
