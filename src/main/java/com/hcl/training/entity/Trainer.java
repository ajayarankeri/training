package com.hcl.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="trainer")
@Data
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trainer_id")
	@JsonIgnore
	private Long trainerId;
	
	@Column(name="trainer_name")
	private String trainerName;
	
	@JsonIgnore
	@Column(name="skill")
	private String skill;
	
	

}
