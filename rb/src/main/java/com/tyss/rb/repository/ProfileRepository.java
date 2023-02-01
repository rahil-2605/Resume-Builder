package com.tyss.rb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.rb.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
