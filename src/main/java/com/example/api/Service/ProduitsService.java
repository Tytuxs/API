package com.example.api.Service;

import com.example.api.DTO.Produits;
import com.example.api.Repository.ProduitsRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProduitsService {

    private final ProduitsRepository produitsRepository;

    public List<Produits> getAllProduits() {
        List<Produits> liste = produitsRepository.findAll();
        for (Produits produits : liste) {
            System.out.println(produits.getProduitID());
            System.out.println(produits.getImage());
            System.out.println(produits.getName());
        }
        return liste;
    }
}
