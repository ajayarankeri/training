package com.hcl.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.training.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

	@Query("select c from Course c where c.courseName like %:courseName%")
	List<Course> findByCourseName(@Param("courseName")String courseName);

	


}
