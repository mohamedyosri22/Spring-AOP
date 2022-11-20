package com.spring.myPack;

import org.springframework.stereotype.Component;

@Component("adb")
public class AccessDataBase {
	
	public void getStudent() {
		//throw new RuntimeException("Noooooo !!");
		System.out.println("Student ");
		throw new RuntimeException("Noooooo !!");
	}
	
	
}
