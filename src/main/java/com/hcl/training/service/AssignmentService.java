package com.hcl.training.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.dto.CourseRequestDto;
import com.hcl.training.dto.ResponseDto;
import com.hcl.training.entity.Assignment;
import com.hcl.training.entity.Course;
import com.hcl.training.entity.Trainee;
import com.hcl.training.exception.ResourceNotFoundException;
import com.hcl.training.repository.AssignmentRepository;
import com.hcl.training.repository.CourseRepository;
import com.hcl.training.repository.TraineeRepository;

@Service
public class AssignmentService {

	@Autowired
	AssignmentRepository assignmentRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	TraineeRepository traineeRepository;
	
	public ResponseDto saveCourseRequest(CourseRequestDto courseRequestDto) throws ResourceNotFoundException {
		
		Course courseObject=courseRepository.findById(courseRequestDto.getCourseId()).orElseThrow(()->new ResourceNotFoundException("course not found"));
		Trainee traineeObject=traineeRepository.findById(courseRequestDto.getTraineeId()).orElseThrow(()->new ResourceNotFoundException("trainee not found"));
		
		Assignment assignment=new Assignment();
		assignment.setTraineeId(traineeObject);
		assignment.setCourseId(courseObject);
		assignment.setTrainerId(courseObject.getTrainerId());
		assignment.setRequestStatus(0);
		assignment.setFromDate(LocalDate.now());
		assignment.setToDate(LocalDate.now());
		assignmentRepository.save(assignment);
		ResponseDto responseDto=new ResponseDto("sucess", 300, "request sent sucessully");
		
		return responseDto;
	}
}
