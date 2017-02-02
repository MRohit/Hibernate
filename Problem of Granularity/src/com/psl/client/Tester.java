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
		
		Address address=new Address("Sinhgad Road","Pune");
		Employee employee=new Employee(123,"Potter",12323.6f,address);
		EmployeeDAO dao=new EmployeeDAOImpl();
		dao.saveEmployee(employee);
		//productDAO.deleteProduct(product2);
	}
}
