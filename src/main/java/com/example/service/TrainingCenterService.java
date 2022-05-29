package com.example.service;
import java.util.List;
import com.example.model.Center;



public interface TrainingCenterService {

	Center saveCenter(Center center);
	List<Center> getCenter();

	
}
