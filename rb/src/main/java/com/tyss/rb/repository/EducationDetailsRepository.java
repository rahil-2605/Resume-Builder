package com.tyss.rb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.rb.entity.EducationDetails;

@Repository
public interface EducationDetailsRepository extends JpaRepository<EducationDetails, Integer> {

}
