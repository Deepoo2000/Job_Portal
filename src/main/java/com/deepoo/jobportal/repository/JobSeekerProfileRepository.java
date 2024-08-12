package com.deepoo.jobportal.repository;

import com.deepoo.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerProfileRepository  extends JpaRepository<JobSeekerProfile, Integer> {
}
