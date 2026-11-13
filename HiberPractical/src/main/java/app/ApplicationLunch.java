package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class ApplicationLunch {	
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Student.class);
		
	    SessionFactory sessionFactory= configuration.buildSessionFactory();
	    
	    Session session= sessionFactory.openSession();
	    Transaction transaction= session.beginTransaction();
	    Student student=new Student();
	    student.setId(1);
	    student.setName("Nikhil");
	    student.setCity("Mumbai");
	    
	    session.persist(student);
	    
	    transaction.commit();
	    session.close();
	}

}
