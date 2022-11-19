package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.myPack.AccessDataBase;
import com.spring.myPack.Person;

public class MainAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(SpringContainer.class);
		AccessDataBase adb = an.getBean("adb",AccessDataBase.class);
		
		System.out.println(adb.getStudent());

	}

}
