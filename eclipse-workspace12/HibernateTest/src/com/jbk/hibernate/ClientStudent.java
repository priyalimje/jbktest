package com.jbk.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ClientStudent {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();//reads cfg file
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Student2.class);
		SessionFactory sf =cfg.buildSessionFactory();//connection
		Session session=sf.openSession();
		//Transaction tt=session.beginTransaction();
		Student ee =new Student("priya",1235);
        session.save(ee);
		
         
        // tt.commit();
	    session.close();
	
	
	    Session session1=sf.openSession();
		Transaction tt1=session1.beginTransaction();
		Student2 st1 =new Student2(2,"Aditi",5235,"Mumbai");
		session1.save(st1);
		tt1.commit();
		session1.close();
		
		 /* Session session2=sf.openSession();
			Student2 st2 =new Student2(3,"trupti",5999,"Nagpur");
			session2.update(st2);
			session2.close();
*/
		
		
		
		
		
		
		
		
	    System.out.println("Data stored successfully");
}}