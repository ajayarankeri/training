package com.hcl.training.controller;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hcl.training.dto.ApproveRequestDto;
import com.hcl.training.dto.CourseRequestDto;
import com.hcl.training.entity.Assignment;
import com.hcl.training.entity.Course;
import com.hcl.training.entity.Trainee;
import com.hcl.training.entity.Trainer;
import com.hcl.training.exception.ResourceNotFoundException;
import com.hcl.training.service.AssignmentService;
import com.hcl.training.service.TrainerService;

@RunWith(SpringJUnit4ClassRunner.class)
public class RequestApproveControllerTest {
	
	@InjectMocks
	TraineeController traineeController;
	
	@InjectMocks
	TrainerController trainerController;
	
	@Mock
	AssignmentService assignmentService;
	
	@Mock
	TrainerService trainerService;

    
	
	Trainee trainee;
	Trainer trainer;
	List<Course> listCourse;
	Course course1,course2;
	CourseRequestDto courseRequestDto;
	ApproveRequestDto approveRequestDto;
	Assignment assignemnt;
	
	
	@Before
	public void setMock() {
		
		approveRequestDto=new ApproveRequestDto();
		approveRequestDto.setRequestId(1);
		approveRequestDto.setFromDate("2019-07-26");
		approveRequestDto.setToDate("2019-07-26");
		
		courseRequestDto=new CourseRequestDto();
		courseRequestDto.setCourseId(1);
		courseRequestDto.setTraineeId(1);
		
		trainee=new Trainee();
		trainee.setTraineeAddress("Pune");
		trainee.setTraineeAge(24);
		trainee.setTraineeId(Long.valueOf(1));
		trainee.setTraineeEmail("vinayakdesaimca@gmail.com");
		trainee.setTraineeMobile("9158022153");
        trainee.setTraineeName("vinayak");
        trainee.setTraineeProficiency("advance");
        trainee.setTraineeSkill("java");
        
        trainer=new Trainer();
        trainer.setTrainerId(Long.valueOf(1));
        trainer.setTrainerName("test1");
        trainer.setSkill("java");
		
		course1=new Course();
		course1.setCourseId(Long.valueOf(1));
		course1.setCourseName("Java");
		course1.setCourseDuration(2);
		course1.setTrainerId(trainer);
		
		course2=new Course();
		course2.setCourseId(Long.valueOf(2));
		course2.setCourseName("Java");
		course2.setCourseDuration(2);
		course2.setTrainerId(trainer);
		
		listCourse=new ArrayList<Course>();
		listCourse.add(course1);
		listCourse.add(course2);
		
		assignemnt=new Assignment();
		assignemnt.setAssignmentId(Long.valueOf(1));
		assignemnt.setCourseId(course1);
        assignemnt.setTraineeId(trainee);
        assignemnt.setTrainerId(trainer);
        assignemnt.setRequestStatus(0);
        assignemnt.setFromDate(LocalDate.parse("2019-07-26"));
        assignemnt.setToDate(LocalDate.parse("2019-07-26"));
	}


	@Test
	public void sentRequestControolerTest() throws ResourceNotFoundException {
		assertNotNull(traineeController.sentRequest(courseRequestDto));
	}
	
	@Test
	public void approveRequestControllerTest() throws ResourceNotFoundException {
		assertNotNull(trainerController.approveRequest(approveRequestDto));
	}
}
