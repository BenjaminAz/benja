package com.neoris.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.lab.converters.DeptEmpConverter;
import com.neoris.lab.dto.DeptEmpDTO;
import com.neoris.lab.entities.DeptEmp;
import com.neoris.lab.repository.DeptEmpRepository;
import com.neoris.lab.service.DeptEmpService;

@Service("DeptEmpService")
public class DeptEmpServiceImpl implements DeptEmpService {

	@Autowired
	private DeptEmpRepository deptEmpRepository;

	@Override
	public DeptEmpDTO save(DeptEmpDTO deptE) {
		DeptEmp deptEmp = DeptEmpConverter.convertToEntity(deptE);
		deptEmp = this.deptEmpRepository.save(deptEmp);
		return DeptEmpConverter.convertToDTO(deptEmp);
	}

	@Override
	public DeptEmpDTO update(DeptEmpDTO deptE) {
		DeptEmp deptEmp = DeptEmpConverter.convertToEntity(deptE);
		deptEmp = this.deptEmpRepository.save(deptEmp);
		return DeptEmpConverter.convertToDTO(deptEmp);
	}

	@Override
	@DELETE
	public void delete(Integer deptId) {
		this.deptEmpRepository.deleteById(deptId);
	}

	@Override
	public DeptEmpDTO findById(Integer deptId) {
		DeptEmp deptoEmp = this.deptEmpRepository.findByEmpNoAndDeptNo(1, 1);
		return DeptEmpConverter.convertToDTO(deptoEmp);
	}

	@Override
	public List<DeptEmpDTO> findAll() {
		List<DeptEmp> allDepartments = this.deptEmpRepository.findAll();
		return DeptEmpConverter.convertToListDTO(allDepartments);
	}

	@Override
	public List<DeptEmpDTO> showDepartmentWithEmployees(Integer empNo, Integer deptNo) {
		List<DeptEmp> allDepartments = this.deptEmpRepository.findByDeptNoAndEmpNo(empNo, deptNo);
		return DeptEmpConverter.convertToListDTO(allDepartments);
	}

}
