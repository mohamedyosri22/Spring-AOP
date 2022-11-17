package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostDaoImpl implements PostDao {
	
	
	@Override
	public void allPosts() {
		System.out.println("My Posts ==> PostDao ");
	}
	
	@Override
	public String allLikes() {
		return "My Likes ==> PostDao";
	}
}
