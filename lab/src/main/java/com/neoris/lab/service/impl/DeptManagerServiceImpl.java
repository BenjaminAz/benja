package com.neoris.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.lab.converters.DeptManagerConverter;
import com.neoris.lab.dto.DeptManagerDTO;
import com.neoris.lab.entities.DeptManager;
import com.neoris.lab.repository.DeptManagerRepository;
import com.neoris.lab.service.DeptManagerService;

@Service("DeptManagerService")
public class DeptManagerServiceImpl implements DeptManagerService {

	@Autowired
	private DeptManagerRepository deptManagerRepository;

	@Override
	public DeptManagerDTO save(DeptManagerDTO manager) {
		DeptManager deptManager = DeptManagerConverter.convertToEntity(manager);
		deptManager = this.deptManagerRepository.save(deptManager);
		return DeptManagerConverter.convertToDTO(deptManager);
	}

	@Override
	public DeptManagerDTO update(DeptManagerDTO manager) {
		DeptManager deptManager = DeptManagerConverter.convertToEntity(manager);
		deptManager = this.deptManagerRepository.save(deptManager);
		return DeptManagerConverter.convertToDTO(deptManager);
	}

	@Override
	public void delete(Integer empNo, Integer deptNo) {
		this.deptManagerRepository.deleteById(empNo);
	}

	@Override
	public DeptManagerDTO findById(Integer empNo, Integer deptNo) {
		DeptManager deptManag = this.deptManagerRepository.findByEmpNoAndDeptNo(empNo, deptNo);
		return DeptManagerConverter.convertToDTO(deptManag);
	}

	@Override
	public List<DeptManagerDTO> findAll() {
		List<DeptManager> deptManagers = this.deptManagerRepository.findAll();
		return DeptManagerConverter.convertToListDTO(deptManagers);
	}
	
/*	public List<DeptManagerDTO> showDepartmentWithManager(Integer empNo, Integer deptNo) {
		List<DeptManager> allDepartments = this.deptManagerRepository.findAll();
		allDepartments = this.deptManagerRepository.findByEmplNoAndDeptNoList(empNo, deptNo);
		return DeptManagerConverter.convertToListDTO(allDepartments);
	} */

}
