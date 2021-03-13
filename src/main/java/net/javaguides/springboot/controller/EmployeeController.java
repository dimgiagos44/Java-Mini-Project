package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import net.javaguides.springboot.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	//display list of employees
	@GetMapping("/employees")
	public String viewHomePage(Model model) {
		
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/departments/{depId}")
	public String viewEmployeesByDepIdPage(Model model, @PathVariable(value="depId") Long depId) {
		model.addAttribute("listEmployees", employeeService.getAllEmployeesByDepId(depId));
		return "employees";
	}
	
	@GetMapping("/employees/{empId}")
	public String viewEmployeesDetails(Model model, @PathVariable(value="empId") Long empId) {
		model.addAttribute("listEmployees", employeeService.getEmployeeByEmpId(empId));
		return "employeesDetails";
	}
}
