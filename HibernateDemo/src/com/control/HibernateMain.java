package com.control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Players;



public class HibernateMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.to.Players.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Players p1 = new Players(10, "Mudit", "India", 23);
		Players p2 = new Players(20, "Namit", "India", 28);
		session.save(p1);
		session.save(p2);
		transaction.commit();
		session.close();
	}
	
}
