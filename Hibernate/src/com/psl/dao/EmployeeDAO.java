package com.psl.dao;

import com.psl.beans.*;

public interface EmployeeDAO {
	//Create
	void saveEmployee(Employee emp);
	//void saveProduct(Product product);
	
	//Read
	Employee getEmployeeByEmpId(int empId);
	
	//Update
	void updateEmployee(Employee emp);
	
	//Delete
	void deleteEmployee(Employee emp);
}
