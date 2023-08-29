package com.example.api.Repository;

import com.example.api.DTO.Bars;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface BarsRepository extends JpaRepository<Bars, Integer>{

    @Query(value = "SELECT * FROM Bars where barId = barid", nativeQuery = true)
    Bars getBarsByBarID(@Param("barId") int barid);
}


