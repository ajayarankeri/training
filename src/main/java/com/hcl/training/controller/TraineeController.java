package com.hcl.training.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.dto.CourseRequestDto;
import com.hcl.training.exception.ResourceNotFoundException;
import com.hcl.training.service.AssignmentService;
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.entity.Course;
import com.hcl.training.service.TraineeService;
>>>>>>> 53f0b393a88b39e6cbc7bc1880a508a740c9a20e

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
		return new ResponseEntity<>(traineeService.getAvailableCources(couserName),HttpStatus.OK);		
	}

}
