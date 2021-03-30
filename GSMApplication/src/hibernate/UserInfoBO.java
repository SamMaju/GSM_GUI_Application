package hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Deepak Kumar
 * 
 *         http://www.roseindia.net Hibernate example to inset data into Contact
 *         table
 */

public class UserInfoBO {
	public static void myMethod(String name, long phone_numb, String mail) {
		Session session = null;
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for use
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			// Create new instance of Contact and set values in it by reading them from form object
			System.out.println("Inserting Record");
			Contact contact = new Contact();
			contact.setPhone_number(phone_numb);
			if (name != null && mail != null) {
				contact.setName(name);
				contact.setEmail(mail);
			}

			session.save(contact);
			session.getNamedQuery("").setMaxResults(10).list();
			System.out.println("Done");
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// Actual contact insertion will happen at this step
			session.flush();
			session.close();

		}

	}
}

/*
 * public class UserInfoBO { public static void myMethod() { Session session =
 * null;
 * 
 * 
 * 
 * try{ // This step will read hibernate.cfg.xml and prepare hibernate for use
 * SessionFactory sessionFactory = new
 * Configuration().configure().buildSessionFactory(); session
 * =sessionFactory.openSession();
 * 
 * org.hibernate.Transaction tx = session.beginTransaction(); //Create new
 * instance of Contact and set values in it by reading them from form object
 * System.out.println("Inserting Record"); Contact contact = new Contact();
 * contact.setPhone_number(19191992); //if(name!=null&&mail!=null){
 * contact.setName("name1"); contact.setEmail("name@www"); //}
 * 
 * 
 * session.save(contact); System.out.println("Done"); tx.commit();
 * }catch(Exception e){ System.out.println(e.getMessage()); }finally{ // Actual
 * contact insertion will happen at this step session.flush(); session.close();
 * 
 * }
 * 
 * } }
 */