package com.spring.myPack;

import org.springframework.stereotype.Component;

@Component("adb")
public class AccessDataBase {
	
	public String getStudent() {
		return "Name = Mohamed"; 
	}
}
