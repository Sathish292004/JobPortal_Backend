package sathish292004.springbootrest.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sathish292004.springbootrest.model.JobPost;
import sathish292004.springbootrest.repo.JobRepo;

import java.util.List;


@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();

    }

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }
    public JobPost getJob(int postId) {

        return repo.getJob(postId);
    }
    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);

    }
    public void deleteJob(int postId) {
        repo.deleteJob(postId);

    }

}