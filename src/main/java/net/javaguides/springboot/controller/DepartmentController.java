package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.service.DepartmentService;



@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/departments")
	public String viewDepartmentsPage(Model model) {
		model.addAttribute("listDepartments", departmentService.getAllDepartments());
		return "departments";
	}
	
	@GetMapping("/locations/{locId}")
	public String viewDepartmentsByLocIdPage(Model model, @PathVariable(value="locId") Long locId) {
		model.addAttribute("listDepartments", departmentService.getAllDepartmentsByLocId(locId));
		return "departments";
	}
	
	
	
}
