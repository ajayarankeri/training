package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
