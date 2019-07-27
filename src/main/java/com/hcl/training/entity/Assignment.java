package com.hcl.training.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="assignment")
@Data
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="assignment_id")
	private Long assignmentId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="trainee_id")
	private Trainee traineeId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="trainer_id")
	private Trainer trainerId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="course_id")
	private Course courseId;
	
	@Column(name="request_status")
	private int requestStatus;
	
	@Column(name="from_date")
	private LocalDate fromDate;
	
	@Column(name="to_date")
	private LocalDate toDate;
	
}
