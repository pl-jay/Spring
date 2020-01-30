package com.pathum.training.salesmanager.service;

import java.util.List;

import com.pathum.training.salesmanager.model.Employee;
import com.pathum.training.salesmanager.repositories.EmployeeRepository;


public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployees();
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	
}
