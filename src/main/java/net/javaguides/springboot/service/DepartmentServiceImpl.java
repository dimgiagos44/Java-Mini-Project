package net.javaguides.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Department;
import net.javaguides.springboot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
	
	
	public List<Department> getAllDepartmentsByLocId(Long locId){
		//List<Department> departments = new ArrayList<>();
		//departmentRepository.findByLocId(locId).forEach(departments::add);
		return departmentRepository.findByLocId(locId);
	}

}
