package com.neoris.lab.converters;

import java.util.ArrayList;
import java.util.List;

import com.neoris.lab.dto.DeptEmpDTO;
import com.neoris.lab.entities.DeptEmp;

public class DeptEmpConverter {

	public static DeptEmpDTO convertToDTO(DeptEmp deptEmp) {
		DeptEmpDTO dto = new DeptEmpDTO();
		dto.setEmpNo(deptEmp.getEmpNo());
		dto.setDeptNo(deptEmp.getDeptNo());
		dto.setFromDate(deptEmp.getFromDate());
		dto.setToDate(deptEmp.getToDate());
		return dto;
	}

	public static DeptEmp convertToEntity(DeptEmpDTO dto) {
		DeptEmp dept = new DeptEmp();
		dept.setEmpNo(dto.getEmpNo());
		dept.setDeptNo(dto.getDeptNo());
		dept.setFromDate(dto.getFromDate());
		dept.setToDate(dto.getToDate());
		return dept;
	}

	public static List<DeptEmpDTO> convertToListDTO(List<DeptEmp> allDepartments) {
		List<DeptEmpDTO> allDepartmentsDTO = new ArrayList<DeptEmpDTO>();
		for (DeptEmp deptEmp : allDepartments) {
			DeptEmpDTO depEmp = convertToDTO(deptEmp);
			allDepartmentsDTO.add(depEmp);
		}

		return allDepartmentsDTO;
	}

}
