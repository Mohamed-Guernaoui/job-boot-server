package org.example.app.springbootmicroservicesapi.Job.Implementation;

import org.example.app.springbootmicroservicesapi.Job.Job;
import org.example.app.springbootmicroservicesapi.Job.JobService;

import java.util.List;

public class JobServiceImplementation implements JobService {

    @Override
    public List<Job> getAll() {
        return List.of();
    }

    @Override
    public void add(Job job) {

    }
}
