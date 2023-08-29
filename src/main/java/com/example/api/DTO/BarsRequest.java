package com.example.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarsRequest {

    private int barID;
    private String name;
    private String latitude;
    private String longitude;
    private String mapsUrl;
    private String image;
    private Double minCard;
    private Integer ouverture;
    private Integer fermeture;
    private Boolean exterieur;
    private Boolean interieur;
    private Boolean fumeur;
    private Boolean toilettes;
    private Boolean wifi;
    private Boolean toilettesPayante;
    private Boolean manger;
    private String happyHour;
}
