package net.javaguides.springboot.service;

import java.util.List;


import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	List<Employee> getAllEmployeesByDepId(Long depId);
	List<Employee> getEmployeeByEmpId(Long empId);
	List<Employee> getEmployeeByFirstName(String firstName);
}
