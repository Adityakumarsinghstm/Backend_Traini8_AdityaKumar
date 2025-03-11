package com.traini8.service;

import com.traini8.model.TrainingCenter;

import java.util.List;
import java.util.Optional;

public interface TrainingCenterService {
    TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> getAllTrainingCenters(Optional<String> cityFilter);
}
