package com.niit.hello.DAO;

import java.util.List;

import com.niit.hello.model.Job;

public interface JobDao {
	
	void addJob(Job job);
	List<Job> getAllJobs();
	Job getJob(int id);

}
