package com.neoris.lab.service;

import java.util.List;

import com.neoris.lab.dto.DeptEmpDTO;

public interface DeptEmpService {

	DeptEmpDTO save(DeptEmpDTO deptoEmp);

	DeptEmpDTO update(DeptEmpDTO deptoEmp);

	void delete(Integer dptoId);

	DeptEmpDTO findById(Integer dptoId);

	List<DeptEmpDTO> findAll();

	List<DeptEmpDTO> showDepartmentWithEmployees(Integer empNo, Integer deptNo);
}
