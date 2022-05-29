package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Center;

public interface TrainingCenterRepository extends JpaRepository<Center, Integer> {

}
