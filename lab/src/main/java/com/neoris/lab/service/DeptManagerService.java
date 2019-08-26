package com.neoris.lab.service;

import java.util.List;

import com.neoris.lab.dto.DeptManagerDTO;

public interface DeptManagerService {

	DeptManagerDTO save(DeptManagerDTO manager);

	DeptManagerDTO update(DeptManagerDTO manager);

	void delete(Integer empNo, Integer deptNo);

	DeptManagerDTO findById(Integer empNo, Integer deptNo);

	List<DeptManagerDTO> findAll();
	
//	List<DeptManagerDTO> showDepartmentWithManager(Integer empNo, Integer deptNo);
}
