package com.psl.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.psl.beans.*;
import com.psl.utility.HibernateUtility;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle(1,"2003");
		
		TwoWheeler tw=new TwoWheeler(1, "2005", "asdas");
		FourWheeler fw=new FourWheeler(2, "2007", "asdas");
		User user1=new User(101,"TOM",tw);
		User user2=new User(102,"TOM",fw);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session session=sf.openSession();
		try{
			session.beginTransaction();
			//session.save(vehicle);
			session.save(user1);
			session.save(user2);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error");
		}
		session.close();
		/*try{
		Session session1=sf.openSession();
		session1.beginTransaction();
		Integer i=new Integer(101);
		User u=(User)session1.get(User.class, i);
		System.out.println(u.getUserId());
		System.out.println(u.getUserName());
		System.out.println(u.getVehicle());
		}catch(Exception e){
			System.out.println("Error");
		}*/
	}

}
