package com.hcl.training.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.dto.ResponseDto;
import com.hcl.training.dto.TraineeDto;
import com.hcl.training.entity.Course;
import com.hcl.training.entity.Trainee;
import com.hcl.training.exception.TraineeAlreadyAddedException;
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

	public ResponseDto registerNewTrainee(TraineeDto newTrainee) throws  TraineeAlreadyAddedException{
		
		Trainee trainee = new Trainee();
		BeanUtils.copyProperties(newTrainee, trainee);
		if(null!=traineeRepository.findByTraineeEmail(trainee.getTraineeEmail())) {
			throw new TraineeAlreadyAddedException("Trainee Already Added. Please select courses.");
		}		
		traineeRepository.save(trainee);
		return new ResponseDto("success",200,trainee.getTraineeId());
	}
	
}
