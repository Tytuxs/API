package com.example.api.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cartes")
public class Cartes implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarteID")
    private int idCarte;

    // Relation avec la table "bars"
    @JsonSerialize(using = BarsSerializer.class)
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bar")
    private Bars bar;

    // Relation avec la table "produits"
    @JsonSerialize(using = ProduitsSerializer.class)
    @ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_produit")
    private Produits produit;

    @Column(name = "prix")
    private Double prix;

}
