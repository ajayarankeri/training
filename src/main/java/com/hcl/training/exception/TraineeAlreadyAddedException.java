package com.hcl.training.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
public class TraineeAlreadyAddedException extends Exception{

	private static final long serialVersionUID = -522494341612344312L;
	
	public  TraineeAlreadyAddedException(String message) {
		super(message);
	}
}