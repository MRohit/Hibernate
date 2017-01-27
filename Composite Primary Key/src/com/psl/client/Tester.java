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
		//for Identity in config 'create' is used...
		/*
		 * identity is database independent and increment is database dependent
		 * 
		 * for composite primary key... the class must implement Serializable
		 */
		Address address=new Address("Sinhgad Road","Pune");
		Employee employee=new Employee(2323,address,new EmpPK(1,"Harry"));
		Employee employee2=new Employee(12323,address,new EmpPK(2,"Rohit"));
		Employee employee3=new Employee(12323,address,new EmpPK(3,"Dom"));
		EmployeeDAO dao=new EmployeeDAOImpl();
		dao.saveEmployee(employee,employee2,employee3);
		/*dao.saveEmployee(employee2);
		dao.saveEmployee(employee3);*/
		//productDAO.deleteProduct(product2);
	}
}
