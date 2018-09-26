package com.niit.hello.DAO;

import java.util.List;

import com.niit.hello.model.Friend;
import com.niit.hello.model.User;

public interface FriendDao 
{

	List<User> suggestedUsers(String email);

	void addFriend(Friend friend);
	
	List<Friend> pendingRequests(String toIdEmail);

	void acceptRequest(Friend request);

	void deleteRequest(Friend request);
	
	List<Friend> listOfFriends(String email);
}
