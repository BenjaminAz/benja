package com.neoris.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.lab.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmpNo(Integer empNo);

	List<Employee> findByFirstName(String firstName);

	

	


	

}
