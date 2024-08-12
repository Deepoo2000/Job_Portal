package com.deepoo.jobportal.repository;

import com.deepoo.jobportal.entity.JobPostActivity;
import com.deepoo.jobportal.entity.JobSeekerApply;
import com.deepoo.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);


}
