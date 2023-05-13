package com.example.api.Service;

import com.example.api.DTO.Chambre;
import com.example.api.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChambreService {

    private final ChambreRepository chambreRepository;

    public List<Chambre> getAllChambre() {
        List<Chambre> liste = chambreRepository.findAll();
        for (int i=0; i<liste.size();i++) {
            System.out.println(liste.get(i).getNumeroChambre());
            System.out.println(liste.get(i).getPrixHTVA());
            System.out.println(liste.get(i).getCategorie());
            System.out.println(liste.get(i).getTypeChambre());
            System.out.println(liste.get(i).getNbOccupants());
        }
        return liste;
    }
}
