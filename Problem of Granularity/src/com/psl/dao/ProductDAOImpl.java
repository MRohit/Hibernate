package com.psl.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.psl.beans.Employee;
import com.psl.beans.Product;
import com.psl.utility.HibernateUtility;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public void deleteProduct(Product product) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		
		//create a new session
		Session session=sf.openSession();
		Transaction tx=null;
		try{
			tx = session.beginTransaction();
			session.delete(product);
			tx.commit();	//session.getTransaction().commit(); if you don't want to create
			//transaction object
			System.out.println("Product Table Created");
			session.close();
		}catch(Exception e){
			tx.rollback();
		}
		
	}

	@Override
	public Product getProductById(int id) {
		// while retrieving we don't we require transaction
		SessionFactory sf=HibernateUtility.getSessionFactory();
		
		//create a new session
		Session session=sf.openSession();
		Product product=(Product)session.get(Product.class, id);
		return product;
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
SessionFactory sf=HibernateUtility.getSessionFactory();
		
		//create a new session
		Session session=sf.openSession();
		Transaction tx=null;
		try{
			tx = session.beginTransaction();
			session.save(product);
			tx.commit();	//session.getTransaction().commit(); if you don't want to create
			//transaction object
			System.out.println("Product Table Created");
			session.close();
		}catch(Exception e){
			tx.rollback();
		}
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.getSessionFactory();
		
		//create a new session
		Session session=sf.openSession();
		Transaction tx=null;
		try{
			tx = session.beginTransaction();
			session.update(product);
			tx.commit();	//session.getTransaction().commit(); if you don't want to create
			//transaction object
			System.out.println("Product Table Created");
			session.close();
		}catch(Exception e){
			tx.rollback();
		}
	}

}
