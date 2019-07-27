package com.hcl.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="trainer")
@Data
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trainer_id")
	private Long trainerId;
	
	@Column(name="trainer_name")
	private Long trainerName;
	
	@Column(name="skill")
	private Long skill;
	
	

}
