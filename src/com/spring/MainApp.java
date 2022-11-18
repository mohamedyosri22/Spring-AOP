package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;
import com.spring.model.User;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(SpringContainer.class);
		PostDao po = an.getBean("postDaoImpl", PostDao.class);
		User user = new User();
		int result = 0;
		po.allPosts(user);
		System.out.println(po.allLikes(user, result));
		po.funDao();

		System.out.println("*********************************");
		po.setId();
		po.getId();

		System.out.println("=============================");

		PostService ps = an.getBean("postServiceImpl", PostService.class);
		System.out.println(ps.allPosts(user, result));
		System.out.println(ps.allLikes(user));
		ps.startService();

		System.out.println("*********************************");
		ps.setName();
		ps.getName();
	}

}
