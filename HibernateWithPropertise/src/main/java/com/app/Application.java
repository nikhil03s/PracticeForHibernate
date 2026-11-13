package com.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mode.Employee;

public class Application {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		Session session=null;
		Transaction transaction=null;
		
		session =configuration.addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
		try {
		transaction =session.beginTransaction();
		
		Employee emp= new Employee();
		emp.setEid(1);
		emp.setEname("Nikhil");
		
		session.persist(emp);
		}
		catch (HibernateException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			transaction.commit();
			session.close();
		}
		
		
	}

}
