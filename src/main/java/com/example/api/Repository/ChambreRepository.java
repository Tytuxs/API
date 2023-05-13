package com.example.api.Repository;

import com.example.api.DTO.Chambre;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Integer> {

    @Query(value = "SELECT * FROM Chambre where categorie like %:categorie%", nativeQuery = true)
    Optional<List<Chambre>> findByCategorie(@Param("categorie") String categorie);
}
