package com.psl.client;

import java.util.*;

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
		Vehicle v1=new Vehicle(1,"Honda");
		Vehicle v2=new Vehicle(2,"Maruti");
		
		TwoWheeler tw=new TwoWheeler(1, "2005", "asdas");
		FourWheeler fw=new FourWheeler(2, "2007", "asdas");
		FourWheeler fw2=new FourWheeler(3, "2207", "asdas");
		Set<Vehicle> vehicle=new HashSet<Vehicle>();
	/*	vehicle.add(tw);
		vehicle.add(fw);
		vehicle.add(fw2);*/
		vehicle.add(v1);
		TwoWheeler tw2=new TwoWheeler(4, "2005", "asdas");
		FourWheeler fw22=new FourWheeler(5, "2007", "asdas");
		FourWheeler fw222=new FourWheeler(6, "2207", "asdas");
		Set<Vehicle> vehicle2=new HashSet<Vehicle>();
		/*vehicle.add(tw2);
		vehicle.add(fw22);
		vehicle.add(fw222);*/
		vehicle2.add(v2);
		
		
		User user1=new User(101,"TOM",vehicle);
		User user2=new User(102,"TOM",vehicle2);
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
