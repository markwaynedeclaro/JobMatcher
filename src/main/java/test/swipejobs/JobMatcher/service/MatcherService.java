package test.swipejobs.JobMatcher.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import test.swipejobs.JobMatcher.dto.Job;
import test.swipejobs.JobMatcher.dto.Worker;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class MatcherService {

	
    public Worker getWorker(final int id) {
    	
    	RestTemplate restTemplate = new RestTemplate();
    	Worker[] workers = restTemplate.getForObject("http://test.swipejobs.com/api/workers", Worker[].class);
    	
        return Arrays.stream(workers).filter(w->w.getUserId()==id).findFirst().get();
    }
    
    public List<Job> getMatchedJobs(final Worker worker) {
    	
    	RestTemplate restTemplate = new RestTemplate();
    	Job[] jobs = restTemplate.getForObject("http://test.swipejobs.com/api/jobs", Job[].class);
    	
    	Comparator<Job> byMatchedCertificate = (c1, c2) -> Integer.compare(
                c2.getRequiredCertificates().length, c1.getRequiredCertificates().length);
    	
    	Comparator<Job> bySalary = (s1, s2) -> Double.compare(
    			Double.parseDouble(s2.getBillRate().replace("$", "")), 
    			Double.parseDouble(s1.getBillRate().replace("$", "")));
    	
    	List<Job> matchedJobs = 
    			Arrays.stream(jobs)
    				.filter(i->Arrays.asList(worker.getCertificates()).containsAll(Arrays.asList(i.getRequiredCertificates())))
    				.sorted(bySalary.thenComparing(byMatchedCertificate))
    				.limit(3)
    				.collect(Collectors.toList());
    	
        return matchedJobs;
    }
    
    

    
}
