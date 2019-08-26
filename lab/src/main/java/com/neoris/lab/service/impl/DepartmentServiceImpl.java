package com.neoris.lab.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.lab.converters.DepartmentConverter;
import com.neoris.lab.dto.DepartmentDTO;
import com.neoris.lab.entities.Department;
import com.neoris.lab.entities.DeptEmp;
import com.neoris.lab.repository.DepartmentRepository;
import com.neoris.lab.repository.EmployeeRepository;
import com.neoris.lab.service.DepartmentService;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	private EmployeeRepository employeeRepository;

	@Override
	public DepartmentDTO save(DepartmentDTO dpto) {
		Department department = DepartmentConverter.convertToEntity(dpto);
		department = this.departmentRepository.save(department);

		return DepartmentConverter.convertToDTO(department);
	}

	@Override
	public DepartmentDTO update(DepartmentDTO dpto) {
		Department department = DepartmentConverter.convertToEntity(dpto);
		department = this.departmentRepository.save(department);
		return DepartmentConverter.convertToDTO(department);
	}

	@Override
	public void delete(Integer dptoId) {
		this.departmentRepository.deleteById(dptoId);
	}

	@Override
	public DepartmentDTO findById(Integer dptoId) {
		Department depto = new Department();
		depto = this.departmentRepository.findByDeptNo(dptoId);
		return DepartmentConverter.convertToDTO(depto);
	}

	@Override
	public List<DepartmentDTO> findAll() {
		List<Department> allDepartments = this.departmentRepository.findAll();
		return DepartmentConverter.convertToListDTO(allDepartments);
	}
	
	
	

	public List<DepartmentDTO> showName(String deptName) {
		List<Department> allDepartments = this.departmentRepository.findByDeptName(deptName);
		return DepartmentConverter.convertToListDTO(allDepartments);
	}

}
