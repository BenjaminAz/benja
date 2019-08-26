package com.neoris.lab.converters;

import java.util.ArrayList;
import java.util.List;

import com.neoris.lab.dto.DeptManagerDTO;
import com.neoris.lab.entities.DeptManager;

public class DeptManagerConverter {

	public static DeptManagerDTO convertToDTO(DeptManager deptManager) {

		DeptManagerDTO manager = new DeptManagerDTO();
		manager.setDepartment(DepartmentConverter.convertToDTO(deptManager.getDepartment()));
		manager.setDeptNo(deptManager.getDeptNo());
		manager.setEmployee(EmployeeConverter.convertToDTO(deptManager.getEmployee()));
		manager.setEmpNo(deptManager.getEmpNo());
		manager.setFromDate(deptManager.getFromDate());
		manager.setToDate(deptManager.getToDate());

		return manager;
	}

	public static DeptManager convertToEntity(DeptManagerDTO manager) {
		DeptManager deptManager = new DeptManager();
		deptManager.setDeptNo(manager.getDeptNo());
		deptManager.setEmpNo(manager.getEmpNo());
		deptManager.setFromDate(manager.getFromDate());
		deptManager.setToDate(manager.getToDate());
		return deptManager;
	}

	public static List<DeptManagerDTO> convertToListDTO(List<DeptManager> allDepartments) {
		List<DeptManagerDTO> allDepartmentsDTO = new ArrayList<DeptManagerDTO>();
		for (DeptManager deptManager : allDepartments) {
			DeptManagerDTO depManager = convertToDTO(deptManager);
			allDepartmentsDTO.add(depManager);
		}

		return allDepartmentsDTO;
	}

}
