package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostServiceImpl implements PostService {

	@Override
	public String allPosts(User user,int result) {
		return "My Posts ==> PostService";
	}
	
	@Override
	public String allLikes(User user) {
		return "My Likes ==> PostService";
	}

}
