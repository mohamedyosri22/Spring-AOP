package com.spring.myPack;

import org.springframework.stereotype.Component;

@Component("adb")
public class AccessDataBase {
	
	public String getStudent() {
		//throw new RuntimeException("Noooooo !!");
		return "Name = Mohamed"; 
	}
}
