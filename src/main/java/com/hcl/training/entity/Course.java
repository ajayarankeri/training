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


import lombok.Data;

@Entity
@Table(name="course")
@Data
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cource_id")
	private Long courceId;
	
	
	@Column(name="cource_name")
	private Long courceName;
	
	@Column(name="cource_description")
	private Long courceDescription;
	
	@Column(name="cource_duration")
	private Long courceDuration;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="trainer_id")
	private Trainer trainerId;
	
	

}
