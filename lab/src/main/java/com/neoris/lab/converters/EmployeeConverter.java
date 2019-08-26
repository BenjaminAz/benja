package com.neoris.lab.converters;

import java.util.ArrayList;
import java.util.List;
import com.neoris.lab.dto.EmployeeDTO;
import com.neoris.lab.entities.Employee;

public class EmployeeConverter {

	public static EmployeeDTO convertToDTO(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();
		if (null != employee) {
			dto.setEmpNo(employee.getEmpNo());
			dto.setBirthDate(employee.getBirthDate());
			dto.setFirstName(employee.getFirstName());
			dto.setLastName(employee.getLastName());
			dto.setGender(employee.getGender());
			dto.setHireDate(employee.getHireDate());
		}

		return dto;
	}

	public static Employee convertToEntity(EmployeeDTO dto) {
		Employee depto = new Employee();
		if (null != dto) {
			depto.setEmpNo(dto.getEmpNo());
			depto.setBirthDate(dto.getBirthDate());
			depto.setFirstName(dto.getFirstName());
			depto.setLastName(dto.getLastName());
			depto.setGender(dto.getGender());
			depto.setHireDate(dto.getHireDate());
		}

		return depto;
	}

	public static List<EmployeeDTO> convertToListDTO(List<Employee> allEmployees) {
		List<EmployeeDTO> allEmployeesDTO = new ArrayList<EmployeeDTO>();
		for (Employee employee : allEmployees) {
			EmployeeDTO employees = convertToDTO(employee);
			allEmployeesDTO.add(employees);
		}
		return allEmployeesDTO;
	}

	public static EmployeeDTO convertToDTO(EmployeeDTO employee) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setFirstName(employee.getFirstName());
		return dto;
	}
}
