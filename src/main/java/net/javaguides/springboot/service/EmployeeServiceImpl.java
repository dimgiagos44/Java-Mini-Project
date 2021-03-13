package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public List<Employee> getAllEmployeesByDepId(Long depId){
		//List<Department> departments = new ArrayList<>();
		//departmentRepository.findByLocId(locId).forEach(departments::add);
		return employeeRepository.findByDepId(depId);
	}
	
	public List<Employee> getEmployeeByEmpId(Long empId) {
		return employeeRepository.findByEmpId(empId);
	}
	
	public List<Employee> getEmployeeByFirstName(String firstName){
		return employeeRepository.findByFirstName(firstName);
	}
	
	


}
