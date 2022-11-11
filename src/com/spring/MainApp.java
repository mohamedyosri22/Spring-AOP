package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(SpringContainer.class);
		PostDao po = an.getBean("postDaoImpl",PostDao.class);
		po.allPosts();
		
		PostService ps = an.getBean("postServiceImpl",PostService.class);
		ps.allPosts();
	}

}
