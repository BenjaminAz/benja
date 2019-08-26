package com.neoris.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.lab.entities.DeptManager;

public interface DeptManagerRepository extends JpaRepository<DeptManager, Integer> {

	DeptManager findByEmpNoAndDeptNo(Integer empNo, Integer deptNo);

	List<DeptManager> findByDeptNoAndEmpNo(Integer empNo, Integer deptNo);

}
