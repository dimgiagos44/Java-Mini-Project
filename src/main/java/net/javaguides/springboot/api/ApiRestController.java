package net.javaguides.springboot.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Department;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Location;
import net.javaguides.springboot.service.DepartmentService;
import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.LocationService;

@RestController
public class ApiRestController {
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private EmployeeService employeeService;
	
	//returning all locations
	@GetMapping(value="/api/locations",  produces={MediaType.APPLICATION_XML_VALUE})
	public List<Location>  getAllLocations(){
		return locationService.getAllLocations();
	}
	
	//returning all departments
	@GetMapping(value="/api/departments", produces= {MediaType.APPLICATION_XML_VALUE})
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	//returning all departments by locId
	@GetMapping(value="/api/locations/{locId}", produces= {MediaType.APPLICATION_XML_VALUE})
	public List<Department> getAllDepartmentsByLocId(@PathVariable(value="locId") Long locId){
		return departmentService.getAllDepartmentsByLocId(locId);
	}
	
	//returning all employees by depId
	@GetMapping(value="/api/departments/{depId}", produces= {MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getAllEmlpoyeesByDepId(@PathVariable(value="depId") Long depId){
		return employeeService.getAllEmployeesByDepId(depId);
	}
	
	//return details of employee with firstName=.. & lastName=..
	@GetMapping(value="/api/employees/firstName/{firstName}", produces= {MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getEmployeeByEmployeeByFirstName
	(@PathVariable(value="firstName") String firstName){
		return employeeService.getEmployeeByFirstName(firstName);
	}
	
	@GetMapping(value="/api/employees/{empId}", produces= {MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getEmployeeByEmployeeByEmpId
	(@PathVariable(value="empId") Long empId){
		return employeeService.getEmployeeByEmpId(empId);
	}
	
}
