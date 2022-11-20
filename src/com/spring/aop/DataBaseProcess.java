package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBaseProcess {
	@Before("execution(public * getStudent())")
	public void begin() {
		System.out.println("Start !!");
	}
	
	@AfterThrowing("execution(public * getStudent())")
	public void myException() {
		System.out.println("this is exception !!");
	}
	
	/*
	@AfterReturning("execution(public String getStudent())")
	public void commit() {
		System.out.println("Commit !!");
	}
	
	@After("execution(public String getStudent())")
	public void commit1() {
		System.out.println("Commit 1 !!");
	}
	*/

}
