package com.neoris.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.lab.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Department findByDeptNo(Integer DeptNo);

	List<Department> findByDeptName(String deptName);

}
