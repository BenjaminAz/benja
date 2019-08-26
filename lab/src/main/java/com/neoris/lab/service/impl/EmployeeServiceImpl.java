package com.neoris.lab.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.lab.converters.EmployeeConverter;
import com.neoris.lab.dto.EmployeeDTO;
import com.neoris.lab.entities.Employee;
import com.neoris.lab.repository.EmployeeRepository;

import com.neoris.lab.service.EmployeeService;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO save(EmployeeDTO dpto) {
		Employee employee = EmployeeConverter.convertToEntity(dpto);
		employee = this.employeeRepository.save(employee);
		return EmployeeConverter.convertToDTO(employee);

	}

	@Override
	public EmployeeDTO update(EmployeeDTO dpto) {
		Employee employee = EmployeeConverter.convertToEntity(dpto);
		employee = this.employeeRepository.save(employee);
		return EmployeeConverter.convertToDTO(employee);

	}

	@Override
	public void delete(Integer dptoId) {
		this.employeeRepository.findById(dptoId);

	}

	@Override
	public EmployeeDTO findById(Integer dptoId) {
		Employee employees = this.employeeRepository.findByEmpNo(1);
		return EmployeeConverter.convertToDTO(employees);

	}

	@Override
	public List<EmployeeDTO> findAll() {
		List<Employee> allDepartments = this.employeeRepository.findAll();
		return EmployeeConverter.convertToListDTO(allDepartments);
	}

	public List<String> showName() {
		List<String> names = new ArrayList<String>();
		List<Employee> allEmployees = this.employeeRepository.findAll();
		
		for (Employee employee : allEmployees) {
			names.add(employee.getFirstName() + " " + employee.getLastName());
		}
		return names;
	}
	

	
}
