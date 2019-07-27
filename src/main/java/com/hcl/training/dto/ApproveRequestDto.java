package com.hcl.training.dto;

import lombok.Data;

@Data
public class ApproveRequestDto {
	
	private long requestId;
	private String fromDate;
	private String toDate;

}
