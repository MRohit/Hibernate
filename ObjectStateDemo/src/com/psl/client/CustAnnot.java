package com.psl.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.psl.beans.Customer;
import com.psl.utility.HibernateUtility;

public class CustAnnot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session session=sf.openSession();
		Customer cust=new Customer(101,"Rohit");
		try{
			session.beginTransaction();
			//session.save(vehicle);
			session.save(cust);
			//session.save(user2);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
