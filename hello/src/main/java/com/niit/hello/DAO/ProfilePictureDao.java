package com.niit.hello.DAO;

import com.niit.hello.model.ProfilePicture;

public interface ProfilePictureDao {

	void uploadProfilePicture(ProfilePicture profilePicture);

	ProfilePicture getImage(String email);
}
