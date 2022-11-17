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
		System.out.println(po.allLikes());
		System.out.println("=============================");
		
		PostService ps = an.getBean("postServiceImpl",PostService.class);
		System.out.println(ps.allPosts());
		System.out.println(ps.allLikes());
	}

}
