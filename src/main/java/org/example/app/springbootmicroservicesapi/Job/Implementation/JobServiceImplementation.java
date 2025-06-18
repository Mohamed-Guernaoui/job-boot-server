package org.example.app.springbootmicroservicesapi.Job.Implementation;

import org.example.app.springbootmicroservicesapi.Job.Job;
import org.example.app.springbootmicroservicesapi.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class JobServiceImplementation implements JobService {
    private List<Job> jobs  = new ArrayList<>() ;

    // @Override
    // public List<Job> getAll() {
    //     return jobs;
    // }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }
}
