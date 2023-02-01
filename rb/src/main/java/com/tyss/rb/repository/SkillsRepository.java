package com.tyss.rb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.rb.entity.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {

}
