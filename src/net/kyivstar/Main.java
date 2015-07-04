package net.kyivstar;





import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.hibernate.Session;


public class Main {

	
	public static void main(String[] args) {
		
		String queryS = "select Igor from Score";
		
		GregorianCalendar date = new GregorianCalendar();
			date.set(2015, 6, 10, 15, 0, 0); 
			
		
		// Write the Student_Info object into the database
		Score score = new Score(2, 3, 4, 2, 2, 0, 1, 1, "blue", date);
		
		


		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		//session.save(score);
	
		
		
		Query query = session.createQuery(queryS);
          System.out.println("++++++++++++++++++= "+query.uniqueResult());
		
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
