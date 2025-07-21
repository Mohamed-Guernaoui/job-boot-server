package org.example.app.springbootmicroservicesapi.Job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private final JobService jobService;
      
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/show-jobs")
    public ResponseEntity<List<Job>> getJobs() {
        return ResponseEntity.ok(jobService.getAll());
    }

    @PostMapping("/new-job")
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("the Job created successfully", HttpStatus.CREATED);
    };

    @GetMapping("/job/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable long id ){
        Job job = jobService.retreiveJobById(id);
        if(job != null)
            return new ResponseEntity<>(job, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        // return "Alert: the Job created successfully ";

    }
}
