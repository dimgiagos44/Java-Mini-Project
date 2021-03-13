package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public List<Employee> findByDepId(Long depId);
	public List<Employee> findByEmpId(Long empId);
	public List<Employee> findByFirstName(String firstName);
	
}
