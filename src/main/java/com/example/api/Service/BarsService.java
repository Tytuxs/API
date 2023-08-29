package com.example.api.Service;

import com.example.api.DTO.Bars;
import com.example.api.Repository.BarsRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class BarsService {

    private final BarsRepository barsRepository;

    public List<Bars> getAllBars() {
        List<Bars> liste = barsRepository.findAll();
        for (Bars bars : liste) {
            System.out.println(bars.getBarID());
            System.out.println(bars.getName());
            System.out.println(bars.getLatitude());
            System.out.println(bars.getLongitude());
            System.out.println(bars.getFumeur());
        }
        return liste;
    }

    public Optional<Bars> getBarById(int barId) {
        return barsRepository.findById(barId);
    }
}
