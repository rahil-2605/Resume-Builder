package com.tyss.rb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.rb.entity.Summary;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Integer> {

}
