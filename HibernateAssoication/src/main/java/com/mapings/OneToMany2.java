package com.mapings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Books;
import com.model.Students;

public class OneToMany2 {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		//Transaction transaction=null;
	
		Session session=configuration.addAnnotatedClass(Students.class).addAnnotatedClass(Books.class).buildSessionFactory().openSession();
//		Students students=new Students();
//		students.setId(1);
//		students.setName("Nikhil");
//		
//		Books books=new Books();
//		books.setId(1);
//		books.setBook_name("RudeBook");
//		
//		
//
//		Books books1=new Books();
//		books1.setId(2);
//		books1.setBook_name("ikigai");
//		
//
//		Books books2=new Books();
//		books2.setId(3);
//		books2.setBook_name("How to be alone");
//		
//		List<Books> nBooks= new ArrayList<Books>();
//		nBooks.add(books);
//		nBooks.add(books1);
//		nBooks.add(books2);
//		
//		students.setBooks(nBooks);
		try {
			//transaction=session.beginTransaction();
		
			Students students=session.get(Students.class,1);
			System.out.println(students);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
		//	transaction.commit();
			session.close();
		}
		
	
	
	
	}

}
