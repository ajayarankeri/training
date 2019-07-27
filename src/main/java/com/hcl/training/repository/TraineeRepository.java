package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.entity.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Long>{

}
