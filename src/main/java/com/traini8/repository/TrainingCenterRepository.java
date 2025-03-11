package com.traini8.repository;

import com.traini8.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Long> {
    List<TrainingCenter> findByAddressCity(String city);
}
