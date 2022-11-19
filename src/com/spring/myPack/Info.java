package com.spring.myPack;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Info {
	
	@Before("execution(public void getData())")
	public void end() {
		System.out.println("End !!");
	}
}
