package test.swipejobs.JobMatcher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.swipejobs.JobMatcher.dto.Job;
import test.swipejobs.JobMatcher.dto.Worker;
import test.swipejobs.JobMatcher.service.MatcherService;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MatcherController {

	@Autowired
	MatcherService matcherService;

    @GetMapping("/worker/{id}")
    public Worker getWorkerById(@PathVariable(value = "id") Integer id) {
        return matcherService.getWorker(id);
    } 
	   
    @GetMapping("/matchedJobs/{id}")
    List<Job> getMatchedJobs(@PathVariable(value = "id") Integer id ) {
    	
        return matcherService.getMatchedJobs(matcherService.getWorker(id));
        
    }


}
