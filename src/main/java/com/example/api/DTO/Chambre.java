package com.example.api.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import javax.validation.constraints.Size;

import java.math.BigDecimal;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "Chambre")
public class Chambre {

    @Id
    @Column(name = "numero_chambre")
    private int numero_chambre;

    @Column(name = "categorie")
    @Size(max = 45)
    private String categorie;

    @Column(name = "type_chambre")
    @Size(max = 45)
    private String type_chambre;

    @Column(name = "nb_occupants")
    private Integer nb_occupants;

    @Column(name = "prix_htva")
    private BigDecimal prix_htva;
}
