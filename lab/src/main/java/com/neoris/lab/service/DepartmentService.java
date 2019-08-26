package com.neoris.lab.service;

import java.util.List;

import com.neoris.lab.dto.DepartmentDTO;
import com.neoris.lab.dto.EmployeeDTO;

public interface DepartmentService {

	DepartmentDTO save(DepartmentDTO dpto);

	DepartmentDTO update(DepartmentDTO dpto);

	void delete(Integer dptoId);

	DepartmentDTO findById(Integer dptoId);

	List<DepartmentDTO> findAll();

	List<DepartmentDTO> showName(String deptName);

}