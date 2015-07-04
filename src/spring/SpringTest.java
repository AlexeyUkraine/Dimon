package spring;

import net.kyivstar.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String queryS = "select Igor from Score";
		
	ApplicationContext context= new ClassPathXmlApplicationContext("SpringConfig1.xml");	
		
	HibernateUtil sessionFactoryObj= (HibernateUtil) context.getBean("sessionFactory");	
		

			
	SessionFactory sessionFactory = sessionFactoryObj.getSessionFactory();
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
