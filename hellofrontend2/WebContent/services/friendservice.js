/**
 * 
 */

app.factory('FriendService',function($http){
	var friendService={}
	
	friendService.getAllSuggestedUsers=function(){
		return $http.get("http://localhost:8088/hellomiddleware1/suggestedusers")
	}
	
	friendService.addFriend=function(toId){
		return $http.post("http://localhost:8088/hellomiddleware1/addfriend",toId)
	}
	
	friendService.getPendingRequests=function()
	{
		return $http.get("http://localhost:8088/hellomiddleware1/pendingrequests");
	}
	
	friendService.acceptRequest=function(request){
		return $http.put("http://localhost:8088/hellomiddleware1/acceptrequest",request);
	}
	
	friendService.deleteRequest=function(request){
		return $http.put("http://localhost:8088/hellomiddleware1",request);
	}
	
	friendService.getAllFriends=function(){
		return $http.get("http://localhost:8088/hellomiddleware1/friends");
	}
	
	
	return friendService;
})