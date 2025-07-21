package org.example.app.springbootmicroservicesapi.Job.Implementation;

import java.util.ArrayList;
import java.util.List;
import org.example.app.springbootmicroservicesapi.Job.Job;
import org.example.app.springbootmicroservicesapi.Job.JobService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImplementation implements JobService {

    private List<Job> jobs = new ArrayList<>();

    @Override
    public List<Job> getAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }
    @Override
    public Job retreiveJobById(long id) {
        // TODO Auto-generated method stub
        for(Job job:jobs){
            if(job.getId() == id){
                return job;
            };
        }

        return null;
    }
}
