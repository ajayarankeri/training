package com.hcl.training.controller;

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

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	AssignmentService assignmentService;
	
	@PostMapping("/request")
	public ResponseEntity<Object> sentRequest(@RequestBody CourseRequestDto courseRequestDto) throws ResourceNotFoundException{	
		return new ResponseEntity<>(assignmentService.saveCourseRequest(courseRequestDto),HttpStatus.OK); 
	}
	
	

}
