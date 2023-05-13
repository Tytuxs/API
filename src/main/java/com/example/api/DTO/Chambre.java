package com.example.api.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {

    @Id
    @Column(name = "numeroChambre")
    @NonNull
    private int numeroChambre;

    @Column(name = "categorie")
    @NonNull
    private String categorie;

    @Column(name = "typeChambre")
    @NonNull
    private String typeChambre;

    @Column(name = "nbOccupants")
    @NonNull
    private Integer nbOccupants;

    @Column(name = "prixHTVA")
    @NonNull
    private BigDecimal prixHTVA;

    // Ajoutez les constructeurs, getters, setters et autres méthodes si nécessaire

    // Exemple de constructeur
    public Chambre(String categorie, String typeChambre, Integer nbOccupants, BigDecimal prixHTVA) {
        this.categorie = categorie;
        this.typeChambre = typeChambre;
        this.nbOccupants = nbOccupants;
        this.prixHTVA = prixHTVA;
    }

    // Exemple de getters et setters
    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public Integer getNbOccupants() {
        return nbOccupants;
    }

    public void setNbOccupants(Integer nbOccupants) {
        this.nbOccupants = nbOccupants;
    }

    public BigDecimal getPrixHTVA() {
        return prixHTVA;
    }

    public void setPrixHTVA(BigDecimal prixHTVA) {
        this.prixHTVA = prixHTVA;
    }
}
