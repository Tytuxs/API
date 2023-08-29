package com.example.api.Controller;

import com.example.api.DTO.Bars;
import com.example.api.Service.BarsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class BarsController {

    @Autowired
    private final BarsService barsService;

    @GetMapping("/allBars")
    public ResponseEntity<List<Bars>> getAllBars() {
        List<Bars> bars = barsService.getAllBars();
        return ResponseEntity.status(HttpStatus.OK).body(bars);
    }

    @PostMapping("/getBarById")
    public ResponseEntity<Optional<Bars>> getBarById(@RequestBody int barId) {
        Optional<Bars> bars = barsService.getBarById(barId);
        return ResponseEntity.status(HttpStatus.OK).body(bars);
    }
}
