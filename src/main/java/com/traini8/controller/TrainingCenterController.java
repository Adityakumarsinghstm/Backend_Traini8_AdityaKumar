package com.traini8.controller;

import com.traini8.model.TrainingCenter;
import com.traini8.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/training-center")       //Parent uri eg:- (http://localhost:9191/training-center)
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService service;

    @PostMapping     //API for creating new Training Center , POST :- (http://localhost:9191/training-center)
    public TrainingCenter createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        return service.saveTrainingCenter(trainingCenter);
    }

    @GetMapping     //API for getting all Training centers Data, GET :- (http://localhost:9191/training-center)
                     // Filter Training center by city,  GET:- (http://localhost:9191/training-center?city=Patna )
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            @RequestParam(required = false) String city
    ) {
        List<TrainingCenter> centers = service.getAllTrainingCenters(Optional.ofNullable(city));
        return ResponseEntity.ok(centers); // Returns empty list if nothing is found
    }
}
