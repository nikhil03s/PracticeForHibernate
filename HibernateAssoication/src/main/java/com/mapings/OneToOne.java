package com.mapings;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customers;
import com.model.Products;

public class OneToOne {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		Session session=null;
		Transaction transaction=null;
		configuration.addAnnotatedClass(Customers.class);
		configuration.addAnnotatedClass(Products.class);
		
		session =configuration.buildSessionFactory().openSession();
		Customers customers=new Customers();
		customers.setCname("Nikhil");
	
		
		Products products= new Products();
		products.setPname("One Diet Coke");
		
		customers.setProducts(products);
		try {
			transaction =session.beginTransaction();
	
			session.persist(customers);
			
			
		}catch (HibernateException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			transaction.commit();
			session.close();
		}
		
		
		
	}
}
