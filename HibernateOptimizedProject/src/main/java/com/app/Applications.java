package com.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.UserInfo;

public class Applications {
	
	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		Transaction transaction=null;
		Session session=null;
		session =configuration.configure().addAnnotatedClass(UserInfo.class).buildSessionFactory().openSession();
		
		try {
			transaction	=session.beginTransaction();
		  
		  UserInfo user= new UserInfo();
		  user.setId(1);
		  user.setName("Nikhil");
		  
		  session.persist(user);
		}catch (HibernateException exception) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			transaction.commit();
			session.close();
		}
		
		
	}

}
