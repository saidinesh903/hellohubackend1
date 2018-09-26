package com.niit.hello.DAO;

import java.util.List;

import com.niit.hello.model.BlogComment;
import com.niit.hello.model.BlogPost;

public interface BlogPostDao {
	
	void addBlogPost(BlogPost blogPost);
	List<BlogPost> listOfBlogs(int approved);
	BlogPost getBlog(int id);
	void approve(BlogPost blog);
	void reject(BlogPost blog,String rejectionReason);
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getAllBlogComments(int blogPostId);

}
