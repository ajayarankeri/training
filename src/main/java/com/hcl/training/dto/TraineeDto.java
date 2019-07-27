package com.hcl.training.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TraineeDto {
	
	@NotNull(message="Please fill details")
	private String traineeName;
	
	@NotNull(message="Please fill details")
	private String traineeAddress;
	
	@NotNull(message="Please fill details")
	private int traineeAge;
	
	
	@NotNull(message="Please fill details")
	@Email
	private String traineeEmail;
	
	@NotNull(message="Please fill details")	
	private Long traineeMobile;
	
	@NotNull(message="Please fill details")
	private String traineeSkill;
	
	@NotNull(message="Please fill details")
	private String traineeProficiency;

}
