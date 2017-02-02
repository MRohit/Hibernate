package com.psl.dao;

import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.beans.Employee;
import com.psl.beans.Product;
import com.psl.utility.HibernateUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void saveEmployee(Employee... emp) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		
		//create a new session
		Session session=sf.openSession();
		Transaction tx=null;
		try{
			tx = session.beginTransaction();
			for(Employee e:emp)
				session.save(e);
			tx.commit();	//session.getTransaction().commit(); if you don't want to create
			//transaction object
			System.out.println("Table Created");
			session.close();
		}catch(Exception e){
			tx.rollback();
		}
		
	}

	@Override
	public Employee getEmployeeByEmpId(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	

}
