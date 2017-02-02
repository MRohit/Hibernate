package com.psl.Client;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.psl.beans.*;

public class Client {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		TwoWheeler tw=new TwoWheeler("Activa","MH-12 LM 7642","Petrol");
		
		FourWheeler f2=new FourWheeler("Charger", "MH-12 LM 7642", "Black");
		//List list2=new ArrayList();
		Address address=new Address("Pune","Maha");
		Address address2=new Address("Pune","Maha");
		Address address3=new Address("Pune","Maha");
		ArrayList<Address> list=new ArrayList<Address>();
		list.add(address);
		list.add(address2);
		list.add(address3);
		
		User u=new User(1, "Rohit", list, tw);
		Platinum pl=new Platinum(12, "asdadas", list, tw,"adsa");
		Titanium p2=new Titanium(123, "asdadas", list,f2,"asddsdsad");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
	    Session session = sf.openSession();
		try {
			session.beginTransaction();
			session.save(u);
			session.save(pl);
			session.save(p2);
			session.getTransaction().commit();
			System.out.println("Record Savedd");
		}catch(Exception e){
			System.out.println("Error");
			e.printStackTrace();
			//session.close();
			session.getTransaction().rollback();
		}
	}
	
}
