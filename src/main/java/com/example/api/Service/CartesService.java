package com.example.api.Service;

import com.example.api.DTO.Cartes;
import com.example.api.Repository.CartesRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CartesService {

    private final CartesRepository cartesRepository;

    public List<Cartes> getAllCartes() {
        List<Cartes> liste = cartesRepository.findAll();
        for (Cartes cartes : liste) {
            System.out.println(cartes.getIdCarte());
            System.out.println(cartes.getPrix());
            System.out.println(cartes.getBar());
            System.out.println(cartes.getProduit());
        }
        return liste;
    }
}
