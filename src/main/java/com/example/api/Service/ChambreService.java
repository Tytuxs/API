package com.example.api.Service;

import com.example.api.DTO.Chambre;
import com.example.api.DTO.ChambreRequest;
import com.example.api.Repository.ChambreRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ChambreService {

    private final ChambreRepository chambreRepository;

    public List<Chambre> getAllChambre() {
        List<Chambre> liste = chambreRepository.findAll();
        for (int i=0; i<liste.size();i++) {
            System.out.println(liste.get(i).getNumero_chambre());
            System.out.println(liste.get(i).getPrix_htva());
            System.out.println(liste.get(i).getCategorie());
            System.out.println(liste.get(i).getType_chambre());
            System.out.println(liste.get(i).getNb_occupants());
        }
        return liste;
    }

    public Chambre addChambre(ChambreRequest chambreRequest) {
        Chambre chambre = Chambre.builder()
                .type_chambre(chambreRequest.getType_chambre())
                .categorie(chambreRequest.getCategorie())
                .nb_occupants(chambreRequest.getNb_occupants())
                .prix_htva(chambreRequest.getPrix_htva())
                .numero_chambre(chambreRequest.getNumero_chambre())
                .build();
        return chambreRepository.save(chambre);
    }
}
