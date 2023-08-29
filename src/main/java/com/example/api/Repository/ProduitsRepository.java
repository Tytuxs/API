package com.example.api.Repository;

import com.example.api.DTO.Produits;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface ProduitsRepository extends JpaRepository<Produits, Integer>{

}


