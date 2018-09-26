/**
 * 
 */

app.factory('JobService',function($http){
	var jobService={}
	
	jobService.addJob=function(job){
		return $http.post("http://localhost:8088/hellomiddleware1/addjob",job)
	}
	
	jobService.getAllJobs=function(){
		return $http.get("http://localhost:8088/hellomiddleware1/alljobs")
	}
	
	jobService.getJob=function(id){
		return $http.get("http://localhost:8088/hellomiddleware1/getjob/"+id)
	}
	
	return jobService;
})