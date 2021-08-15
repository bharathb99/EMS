package com.tp.tpback;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.text.ParseException;  
import java.text.SimpleDateFormat; 

public class TPMain {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
		
		User user = new User();
		
		Customer cus = new Customer();
		cus.setUserID(0);
		cus.setUsername("tom_the_cat");
		cus.setPassword("Toodles@143");
		cus.setName(new Name("Thomas","Cat"));
		cus.setGender("Male");
		cus.setDob(formatter.parse("14/02/1940"));
		cus.setAddress(new Address(0,58,"Tom and Jerry","NewYork",10001,cus));
		cus.setPhone("8649235475");
		cus.setEmail("tom_1940@rediffmail.com");
		
		session.save(cus);
		
		session.getTransaction().commit();
		System.out.println("Txn completed.");

	}

}
