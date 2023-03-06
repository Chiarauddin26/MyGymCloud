package it.corso.mygym.model.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GymDto {
    private Long id;
    private String name;
    private String address;
    private String email;
    private Long pIva;
}
