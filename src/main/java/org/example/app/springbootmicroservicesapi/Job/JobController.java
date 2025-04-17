package org.example.app.springbootmicroservicesapi.Job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private final JobService jobService;
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
    private List<Job> jobs  = new ArrayList<>() ;

    @GetMapping("/show-jobs")
    public List<Job> getJobs() {

        return jobService.getAll();
    }

    @PostMapping("/new-job")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Alert: the Job created successfully ";
    }
}
