package com.neoris.lab.converters;

import java.util.ArrayList;
import java.util.List;

import com.neoris.lab.dto.DepartmentDTO;
import com.neoris.lab.dto.DeptManagerDTO;
import com.neoris.lab.entities.Department;
import com.neoris.lab.entities.DeptManager;

public class DepartmentConverter {

	public static DepartmentDTO convertToDTO(Department department) {
		DepartmentDTO dto = new DepartmentDTO();

		if (null != department) {
			dto.setDeptName(department.getDeptName());
			dto.setDeptNo(department.getDeptNo());
			dto.setDeptManagerDTOs(convertToListDetpManagerDTO(department.getDeptManager()));
		}

		return dto;
	}

	public static Department convertToEntity(DepartmentDTO dto) {
		Department depto = new Department();
		if (null != dto) {
			depto.setDeptName(dto.getDeptName());
			depto.setDeptNo(dto.getDeptNo());
			depto.setDeptManager(convertToListDetpManager(dto.getDeptManagerDTOs()));
		}

		return depto;
	}

	public static List<DepartmentDTO> convertToListDTO(List<Department> allDepartments) {
		List<DepartmentDTO> allDepartmentsDTO = new ArrayList<DepartmentDTO>();
		for (Department dep : allDepartments) {
			DepartmentDTO depto = convertToDTO(dep);
			allDepartmentsDTO.add(depto);
		}

		return allDepartmentsDTO;
	}

	public static List<DeptManagerDTO> convertToListDetpManagerDTO(List<DeptManager> allManagers) {
		List<DeptManagerDTO> allDepartmentsDTO = new ArrayList<DeptManagerDTO>();
		for (DeptManager dep : allManagers) {
			DeptManagerDTO depto = new DeptManagerDTO();
			depto.setDeptNo(dep.getDeptNo());
			depto.setEmployee(EmployeeConverter.convertToDTO(dep.getEmployee()));
			depto.setEmpNo(dep.getEmpNo());
			depto.setFromDate(dep.getFromDate());
			depto.setToDate(dep.getToDate());
			allDepartmentsDTO.add(depto);
		}

		return allDepartmentsDTO;
	}

	public static List<DeptManager> convertToListDetpManager(List<DeptManagerDTO> allManagers) {
		List<DeptManager> allDepartments = new ArrayList<DeptManager>();
		for (DeptManagerDTO dep : allManagers) {
			DeptManager depto = new DeptManager();
			depto.setDeptNo(dep.getDeptNo());
			depto.setEmployee(EmployeeConverter.convertToEntity(dep.getEmployee()));
			depto.setEmpNo(dep.getEmpNo());
			depto.setFromDate(dep.getFromDate());
			depto.setToDate(dep.getToDate());
			allDepartments.add(depto);
		}

		return allDepartments;
	}

}
