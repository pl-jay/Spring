package com.pathum.training.Application;

import com.pathum.training.salesmanager.service.EmployeeService;
//import com.pathum.training.salesmanager.service.EmployeeServiceImpl;
import com.pathum.training.salesmanager.model.Employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String args[]) {
		
		
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			EmployeeService employeeservice = applicationContext.getBean("employeeService", EmployeeService.class);
			
			List<Employee> employees = employeeservice.getAllEmployee();
			
			for(Employee employee: employees) {
				System.out.println(employee.getemployeeName() + "At" + employee.getemployeeLocation());
			}
		
		
		
		
	}

}
