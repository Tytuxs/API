package com.example.api.Controller;

import com.example.api.DTO.Cartes;
import com.example.api.Service.CartesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CartesController {

    @Autowired
    private final CartesService cartesService;

    @GetMapping("/allCartes")
    public ResponseEntity<List<Cartes>> getAllBars() {
        List<Cartes> cartes = cartesService.getAllCartes();
        for (Cartes carte : cartes) {
            System.out.println("Controller");
            System.out.println(carte.getIdCarte());
            System.out.println(carte.getPrix());
            System.out.println(carte.getBar().getBarID());
            System.out.println(carte.getProduit());
        }
        return ResponseEntity.status(HttpStatus.OK).body(cartes);
    }

}
