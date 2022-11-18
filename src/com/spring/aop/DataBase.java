package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
 
@Aspect
@Component
public class DataBase {
	
	@Pointcut("execution(public * com.spring.dao.*.*(..))") 
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()") 
	public void Connection() {
		System.out.println("Connected !!");
	}
	
	@Before("myPointCut()") 
	public void login() {
		System.out.println("login success !!!");
	}
}
