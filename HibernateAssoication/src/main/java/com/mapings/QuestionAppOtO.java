package com.mapings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Answers;
import com.model.Questions;

public class QuestionAppOtO {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		Session session=null;
		Transaction transaction=null;
		
		configuration.configure();
		session=configuration.buildSessionFactory().openSession();
	    
		Questions questions=new Questions();
		questions.setId(1);
		questions.setQuestion("Whats your name?");
		
		Answers answers=new Answers();
		answers.setId(1);
		answers.setAnswer("My name is Nikhil.");
		
		questions.setAnswer(answers);
		
		try {
			transaction=session.beginTransaction();
			session.persist(questions);
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			transaction.commit();
			session.close();
		}
		
		
		
	}
}
