package com.spring.dao;

import com.spring.model.User;

public interface PostService {
	public String allPosts(User user,int result);
	public String allLikes(User user);
}
