package com.traini8.service;

import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {
    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        // Discard any user input for createdOn and set it from server time
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters(Optional<String> cityFilter) {
        if (cityFilter.isPresent()) {
            return repository.findByAddressCity(cityFilter.get());
        }
        return repository.findAll();
    }

}
