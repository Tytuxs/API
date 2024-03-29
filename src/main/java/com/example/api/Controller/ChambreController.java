package com.example.api.Controller;

import com.example.api.DTO.Chambre;
import com.example.api.DTO.ChambreRequest;
import com.example.api.Service.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreController {

    @Autowired
    private final ChambreService chambreService;

    // Get All Restaurant
    @GetMapping("/allChambres")
    public ResponseEntity<List<Chambre>> getAllChambre() {
        List<Chambre> restaurants = chambreService.getAllChambre();
        return ResponseEntity.status(HttpStatus.OK).body(restaurants);
    }

    @PostMapping("/addChambre")
    public ResponseEntity<Chambre> addChambre(@RequestBody ChambreRequest chambreRequest) {
        Chambre chambre = chambreService.addChambre(chambreRequest);
        return ResponseEntity.status(HttpStatus.OK).body(chambre);
    }
}
