package com.niit.hello.DAO;

import com.niit.hello.model.BlogPost;
import com.niit.hello.model.BlogPostLikes;

public interface BlogPostLikesDao {
	
	BlogPostLikes hasUserLikedBlog(int blogId,String email);

	BlogPost updateLikes(int id,String email);

}
