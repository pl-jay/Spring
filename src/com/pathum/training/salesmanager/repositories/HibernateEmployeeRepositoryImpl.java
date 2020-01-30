package com.pathum.training.salesmanager.repositories;

import java.util.ArrayList;
import java.util.List;

import com.pathum.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setemployeeName("Pathum");
		employee.setemployeeLocation("Kandy");
		employees.add(employee);
		return employees;		
	}
}
