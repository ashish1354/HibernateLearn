package com.ash.hibernate.HIbernateLearn;

import org.hibernate.Session;
import com.ash.hibernate.Model.SimpleUser;
import com.ash.hibernate.Model.SimpleUser.Gender;
import com.ash.hibernate.configlearn.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SimpleUser s1SimpleUser = new SimpleUser();
		s1SimpleUser.setName("AsH");
		s1SimpleUser.setGender(Gender.MALE);
		s1SimpleUser.setPassword("new121");
		s1SimpleUser.setEmail("ash@ash.com");

		// StandardServiceRegistryBuilder.destroy(serviceRegistry);

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		SimpleUser s1 = (SimpleUser) session.get(SimpleUser.class, 7);
		session.delete(s1);
		session.getTransaction().commit();

		System.out.println(s1);
	}
}
