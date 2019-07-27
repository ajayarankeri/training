package com.hcl.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.dto.ApproveRequestDto;
import com.hcl.training.exception.ResourceNotFoundException;
import com.hcl.training.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
	
	@Autowired
	TrainerService trainerService;
	
	@PostMapping("/approve/request")
	public ResponseEntity< Object> approveRequest(@RequestBody ApproveRequestDto approveRequestDto ) throws ResourceNotFoundException
	{
		return new ResponseEntity<>(trainerService.approveRequest(approveRequestDto),HttpStatus.OK);
	}

}
