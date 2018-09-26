package com.niit.hello.DAO;

import java.util.List;

import com.niit.hello.model.Notification;

public interface NotificationDao {
	List<Notification> getNotificationsNotViewed(String email);

	Notification getNotification(int id);

	void updateNotification(int id);
}
