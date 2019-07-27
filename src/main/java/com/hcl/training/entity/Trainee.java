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
	private Long traineeName;
	
	@Column(name="trainee_address")
	private Long traineeAddress;
	
	@Column(name="trainee_age")
	private Long traineeAge;
	
	@Column(name="trainee_mail")
	private Long traineeMail;
		
	@Column(name="trainee_mobile")
	private Long traineeMobile;
	
	@Column(name="trainee_skill")
	private Long traineeSkill;
	
	@Column(name="trainee_proficiency")
	private Long traineeProficiency;

}
