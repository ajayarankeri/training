package com.hcl.training.controller;

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

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeService traineeService;
	
	@GetMapping("{couserName}")
	public ResponseEntity<List<Course>> getAvailableCources(@PathVariable("couserName") String couserName) {		
		return new ResponseEntity<>(traineeService.getAvailableCources(couserName),HttpStatus.OK);		
	}

}
