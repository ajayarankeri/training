package com.hcl.training.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 53f0b393a88b39e6cbc7bc1880a508a740c9a20e
import org.springframework.stereotype.Repository;

import com.hcl.training.entity.Course;

@Repository
<<<<<<< HEAD
public interface CourseRepository extends JpaRepository<Course, Long> {
=======
public interface CourseRepository extends JpaRepository<Course, Long>{

	@Query("select c from Course c where c.courseName like %:courseName%")
	List<Course> findByCourseName(@Param("courseName")String courseName);

	

>>>>>>> 53f0b393a88b39e6cbc7bc1880a508a740c9a20e

}
