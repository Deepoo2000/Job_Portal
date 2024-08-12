package com.deepoo.jobportal.repository;

import com.deepoo.jobportal.entity.JobPostActivity;
import com.deepoo.jobportal.entity.JobSeekerProfile;
import com.deepoo.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {
    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);
}
