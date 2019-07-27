package com.hcl.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="trainee")
@Data
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trainee_id")
	private Long traineeId;
	
	@Column(name="trainee_name")
	private String traineeName;
	
	@Column(name="trainee_address")
	private String traineeAddress;
	
	@Column(name="trainee_age")
	private int traineeAge;
	
	@Column(name="trainee_mail")
	private String traineeMail;
		
	@Column(name="trainee_mobile")
	private String traineeMobile;
	
	@Column(name="trainee_skill")
	private String traineeSkill;
	
	@Column(name="trainee_proficiency")
	private int traineeProficiency;

}
