package com.example.api.Controller;

import com.example.api.DTO.Produits;
import com.example.api.Service.ProduitsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProduitsController {

    @Autowired
    private final ProduitsService produitsService;

    @GetMapping("/allProduits")
    public ResponseEntity<List<Produits>> getAllProduits() {
        List<Produits> produits = produitsService.getAllProduits();
        return ResponseEntity.status(HttpStatus.OK).body(produits);
    }
}
