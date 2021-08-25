package com.tp.tpback;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TPMain {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
		
		
		
		session.getTransaction().commit();
		System.out.println("Txn completed.");
	}

}
