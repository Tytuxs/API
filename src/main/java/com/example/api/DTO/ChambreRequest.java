package com.example.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChambreRequest {

    private int numero_chambre;
    private String categorie;
    private String type_chambre;
    private Integer nb_occupants;
    private BigDecimal prix_htva;
    private String fileName;
    private String fileType;
    private String bytes;

}
