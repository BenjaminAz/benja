package com.neoris.lab.service;

import java.util.List;
import com.neoris.lab.dto.EmployeeDTO;

public interface EmployeeService {

	EmployeeDTO save(EmployeeDTO dpto);

	EmployeeDTO update(EmployeeDTO dpto);

	void delete(Integer dptoId);

	EmployeeDTO findById(Integer dptoId);

	List<EmployeeDTO> findAll();

	List<String> showName();
	
//	List<EmployeeDTO> showEmployees();

}
