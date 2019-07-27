package com.hcl.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.training.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long>{

}
