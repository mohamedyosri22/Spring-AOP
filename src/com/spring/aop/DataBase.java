package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
 
@Aspect
@Component
public class DataBase {
	
	@Pointcut("execution(public * com.spring.dao.*.*(..))") 
	public void myPointCut() {}
	
	@Pointcut("execution(public * com.spring.dao.*.get*(..))") 
	public void myGetterCut() {}
	
	@Pointcut("execution(public * com.spring.dao.*.set*(..))") 
	public void mySetterCut() {}
	
	@Pointcut("myPointCut() && !(mySetterCut() || myGetterCut())")
	public void Cut() {}
	
	@Before("Cut()") 
	public void Connection() {
		System.out.println("Connected !!");
	}
	
	@Before("Cut()") 
	public void login() {
		System.out.println("login success !!!");
	}
}
