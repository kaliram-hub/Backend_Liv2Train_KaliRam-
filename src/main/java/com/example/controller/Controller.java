package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Center;
import com.example.repository.TrainingCenterRepository;
import com.example.service.TrainingCenterService;

@RestController
public class Controller {

	@Autowired
	public TrainingCenterRepository trainingCenterRepository;

	// api for saving the details of center
	@PostMapping("/saveCenter")
	public Center savedetails(@Valid @RequestBody Center center) {
		return trainingCenterRepository.save(center);
	}

	
	
	// api for fetching the all center list.
	@GetMapping("/getCenter")
	public List<Center> getAllCenters() {
		return trainingCenterRepository.findAll();
	}

}
