package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBase {
	
	@Before("execution(public void com.spring.dao.PostService.allPosts())")
	public void Connection() {
		System.out.println("Connected !!");
	}
}
