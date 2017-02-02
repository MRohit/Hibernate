package com.psl.client;

import java.util.*;

import com.psl.beans.*;
import com.psl.dao.EmployeeDAO;
import com.psl.dao.EmployeeDAOImpl;
import com.psl.dao.ProductDAO;
import com.psl.dao.ProductDAOImpl;
//bag:Collection interface and stores instance of arraylist
//IdBag:Indexed based,with 1 field extra called as key
//Primitive array:
/*
 * All collections as lazy loaded i.e on demand.
 * Never override toString()
 * Eager loaded are preloaded. e.g. primitive array
 * do not overload toString() for eager and lazy...
 */
public class Tester {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Rohit",450000);
		
		EmployeeDAO dao=new EmployeeDAOImpl();
		ProductDAO productDAO=new ProductDAOImpl();
		
		Product product=new Product(1232,"Guitar",6000);
		List<String> features=new ArrayList<String>();
		features.add("water resistant");
		features.add("low");
		features.add("cool");
		Set<String> contactNo=new TreeSet<String>();
		contactNo.add("123213");
		contactNo.add("123243545");
		contactNo.add("123232432432433");
		product.setContactNo(contactNo);
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"asdsad");
		map.put(2,"njbvlnasdsad");
		map.put(3,"bodfgfg");
		product.setMap(map);
		product.setFeatures(features);
		
		
		List<String> features2=new ArrayList<String>();
		features2.add("low");
		features2.add("cool");
		Product product2=new Product();
		product2.setSrNo(102);
		Set<String> contactNo2=new TreeSet<String>();
		contactNo.add("123213");
		contactNo.add("123243545");
		contactNo.add("123232432432433");
		product.setContactNo(contactNo2);
		Map<Integer,String>map2=new HashMap<Integer,String>();
		map.put(1,"asdsad");
		map.put(2,"njbvlnasdsad");
		map.put(3,"bodfgfg");
		product.setMap(map2);
		product2.setFeatures(features2);
		//dao.saveEmployee(emp);
		
		
		productDAO.saveProduct(product);
		productDAO.saveProduct(product2);
		
		
		//productDAO.deleteProduct(product);
		/*product=productDAO.getProductById(102);
		System.out.println(product.getFeatures());*/
		//if we want all list at beginning then use fetch="join"
		/*
		 * if fetch="join" and lazy="true" then it is contradictory
		 * do not use them together.
		 * fetch="join" is eager.
		 */
		
		//productDAO.deleteProduct(product2);
	}
}
