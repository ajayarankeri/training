package com.hcl.training.controller;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.dto.CourseRequestDto;
import com.hcl.training.dto.TraineeDto;
import com.hcl.training.entity.Course;
import com.hcl.training.exception.ResourceNotFoundException;
import com.hcl.training.exception.TraineeAlreadyAddedException;
import com.hcl.training.service.AssignmentService;
import com.hcl.training.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	AssignmentService assignmentService;
	
	@Autowired
	TraineeService traineeService;
	
	@PostMapping("/request")
	public ResponseEntity<Object> sentRequest(@RequestBody CourseRequestDto courseRequestDto) throws ResourceNotFoundException{	
		return new ResponseEntity<>(assignmentService.saveCourseRequest(courseRequestDto),HttpStatus.OK); 
	}
	



	
	@GetMapping("{couserName}")
	public ResponseEntity<List<Course>> getAvailableCources(@PathVariable("couserName") String couserName) {		
		return new ResponseEntity<>(traineeService.getAvailableCources( couserName),HttpStatus.OK);		
	
	}
	
	@PostMapping("/registration")
	public ResponseEntity<Object> registerNewTrainee(@RequestBody TraineeDto newTrainee) throws TraineeAlreadyAddedException {
		
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(newTrainee.getTraineeEmail());
		
		if(!matcher.matches()) {
			throw new TraineeAlreadyAddedException("Please entre vaild email id");
		}
		return new ResponseEntity<>(traineeService.registerNewTrainee(newTrainee),HttpStatus.OK);
	}

}
