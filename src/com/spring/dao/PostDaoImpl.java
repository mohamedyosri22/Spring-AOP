package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDaoImpl implements PostDao {
	
	
	@Override
	public void allPosts(User user) {
		System.out.println("My Posts ==> PostDao ");
	}
	
	@Override
	public String allLikes(User user,int result) {
		return "My Likes ==> PostDao";
	}

	@Override
	public void funDao() {
		// TODO Auto-generated method stub
		System.out.println("fun dao");
		
	}
}
