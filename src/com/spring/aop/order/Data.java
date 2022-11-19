package com.spring.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class Data {
	
	@Before("execution(public void getData())")
	public void start() {
		System.out.println("Start !!");
	}

}
