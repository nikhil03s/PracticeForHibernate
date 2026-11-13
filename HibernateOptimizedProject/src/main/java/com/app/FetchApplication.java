package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.UserInfo;

public class FetchApplication {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		Session session=null;
		Session session1=null;
		SessionFactory sessionFactory =configuration.configure().addAnnotatedClass(UserInfo.class).buildSessionFactory();
		
		session=sessionFactory.openSession();
		UserInfo userInfo=session.get(UserInfo.class, 1);
		System.out.println(userInfo);
		
		UserInfo userInfo1=session.get(UserInfo.class, 1);
		System.out.println(userInfo1);
		
		System.out.println("=============");
		session1=sessionFactory.openSession();
		UserInfo userInfo2=session.get(UserInfo.class, 1);
		System.out.println(userInfo2);
		
		UserInfo userInfo3=session.get(UserInfo.class, 1);
		System.out.println(userInfo3);
		
	}

}
