package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
	List<Department> getAllDepartmentsByLocId(Long locId);
}
