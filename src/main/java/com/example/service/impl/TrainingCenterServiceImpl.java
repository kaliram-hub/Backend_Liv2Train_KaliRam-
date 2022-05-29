package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Center;
import com.example.repository.TrainingCenterRepository;
import com.example.service.TrainingCenterService;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService{
	
	@Autowired
	TrainingCenterRepository trainingCenterRepository;

	@Override
	public Center saveCenter(Center center) {
		return trainingCenterRepository.save(center);
	}

	@Override
	public List<Center> getCenter() {
		return trainingCenterRepository.findAll();
	}

}
