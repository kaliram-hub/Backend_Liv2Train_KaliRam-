package com.example.model;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Courses_Offered {
	
	private Integer id ;
    private Integer centerId ;
    
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="center", nullable=false)
	 */
    private List<String> courseName ;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCenterId() {
		return centerId;
	}
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}
	public List<String> getCourseName() {
		return courseName;
	}
	public void setCourseName(List<String> courseName) {
		this.courseName = courseName;
	}

    
    
}
