package com.hcl.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="course")
@Data
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	@JsonIgnore
	private Long courseId;
	
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="course_description")
	private String courseDescription;
	
	@Column(name="course_duration")
	private int courseDuration;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="trainer_id")
	private Trainer trainerId;
	
	

}
