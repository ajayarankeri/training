package com.hcl.training.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.dto.ApproveRequestDto;
import com.hcl.training.dto.ResponseDto;
import com.hcl.training.entity.Assignment;
import com.hcl.training.exception.ResourceNotFoundException;
import com.hcl.training.repository.AssignmentRepository;

@Service
public class TrainerService {
	
	@Autowired
	AssignmentRepository assignmentRepository;
	
	public ResponseDto approveRequest(ApproveRequestDto approveRequestDto) throws ResourceNotFoundException {
		
		Assignment assignment=assignmentRepository.findById(approveRequestDto.getRequestId()).orElseThrow(()->new ResourceNotFoundException("not request found"));
		assignment.setRequestStatus(1);
		assignment.setFromDate(LocalDate.parse(approveRequestDto.getFromDate()));
		assignment.setToDate(LocalDate.parse(approveRequestDto.getToDate()));
		assignmentRepository.save(assignment);
		return new ResponseDto("sucess", 300, "request approved sucessully");
	}

}
