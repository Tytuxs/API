package com.example.api.DTO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "bars")
public class Bars implements java.io.Serializable {
    @Id
    @Column(name = "BarID")
    private int barID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Latitude")
    private String latitude;

    @Column(name = "Longitude")
    private String longitude;

    @Column(name = "Maps_url")
    private String mapsUrl;

    @Column(name = "Image")
    private String image;

    @Column(name = "Min_card")
    private Double minCard;

    @Column(name = "Ouverture")
    private Integer ouverture;

    @Column(name = "Fermeture")
    private Integer fermeture;

    @Column(name = "Exterieur")
    private Boolean exterieur;

    @Column(name = "Interieur")
    private Boolean interieur;

    @Column(name = "Fumeur")
    private Boolean fumeur;

    @Column(name = "Toilettes")
    private Boolean toilettes;

    @Column(name = "Wifi")
    private Boolean wifi;

    @Column(name = "Toilettes_payante")
    private Boolean toilettesPayante;

    @Column(name = "manger")
    private Boolean manger;

    @Column(name = "happy_hour")
    private String happyHour;
}

