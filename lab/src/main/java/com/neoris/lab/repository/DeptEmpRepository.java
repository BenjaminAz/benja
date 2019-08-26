package com.neoris.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.lab.entities.DeptEmp;

public interface DeptEmpRepository extends JpaRepository<DeptEmp, Integer> {
	
	DeptEmp findByEmpNoAndDeptNo(Integer empNo, Integer deptNo);

	List<DeptEmp> findByDeptNoAndEmpNo(Integer deptNo, Integer empNo);
	
}
