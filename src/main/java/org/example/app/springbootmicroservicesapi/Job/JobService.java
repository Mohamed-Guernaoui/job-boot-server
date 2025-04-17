package org.example.app.springbootmicroservicesapi.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();
    void createJob(Job job);
}
