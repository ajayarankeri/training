package com.hcl.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.entity.Course;
import com.hcl.training.repository.CourseRepository;
import com.hcl.training.repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	TraineeRepository traineeRepository;
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAvailableCources(String couserName) {
		
		return courseRepository.findByCourseName(couserName);
		
		
	}

	
}
