package com.pathum.training.salesmanager.repositories;

import java.util.List;

import com.pathum.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}