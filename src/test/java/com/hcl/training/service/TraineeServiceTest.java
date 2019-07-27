package com.hcl.training.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hcl.training.entity.Trainee;
import com.hcl.training.entity.Trainer;
import com.hcl.training.entity.Course;

@RunWith(SpringJUnit4ClassRunner.class)
public class TraineeServiceTest {

	
	Trainee trainee;
	Trainer trainer;
	List<Course> listCourse;
	Course course1,course2;
	
	
	@Before
	public void setMock() {
		
		trainee=new Trainee();
		trainee.setTraineeAddress("Pune");
		trainee.setTraineeAge(24);
		trainee.setTraineeId(Long.valueOf(1));
		trainee.setTraineeMail("vinayakdesaimca@gmail.com");
		trainee.setTraineeMobile("9158022153");
        trainee.setTraineeName("vinayak");
        trainee.setTraineeProficiency("advance");
        trainee.setTraineeSkill("java");
        
        trainer=new Trainer();
        trainer.setTrainerId(Long.valueOf(1));
        trainer.setTrainerName("test1");
        trainer.setSkill("java");
		
		course1=new Course();
		course1.setCourceId(Long.valueOf(1));
		course1.setCourceName("Java");
		course1.setCourceDuration(Long.valueOf(2));
		course1.setTrainerId(trainer);
		
		course2=new Course();
		course2.setCourceId(Long.valueOf(2));
		course2.setCourceName("Java");
		course2.setCourceDuration(Long.valueOf(2));
		course2.setTrainerId(trainer);
		
		listCourse=new ArrayList<Course>();
		listCourse.add(course1);
		listCourse.add(course2);
		
	}
}
