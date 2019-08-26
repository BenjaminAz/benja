package com.neoris.lab.repository;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.neoris.lab.app.Application;
import com.neoris.lab.converters.EmployeeConverter;
import com.neoris.lab.entities.Employee;
import com.neoris.lab.entities.genderEnum;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void test_1_Save() {
		Employee emp = new Employee();
		emp.setEmpNo(1);
		emp.setFirstName("Matias");
		emp.setLastName("Lacosta");
		emp.setBirthDate(new Date());
		emp.setGender(genderEnum.M);
		emp.setHireDate(new Date());
		emp = this.employeeRepository.save(emp);
		assertTrue("Se registró el departamento", emp.getEmpNo() != null);
	}

	@Test
	public void test_2_Update() {
		Employee emp = new Employee();
		emp.setEmpNo(1);
		emp.setFirstName("Prueba de nuevo Departamento");
		emp.setLastName("Juanete dos xdxd");
		emp.setBirthDate(new Date());
		emp.setGender(genderEnum.M);
		emp.setHireDate(new Date());
		emp = this.employeeRepository.save(emp);
		assertTrue("Se modificó el departamento", emp.getEmpNo() != null);
	}

	@Test
	public void test_3_GetById() {
		Optional<Employee> Emp = this.employeeRepository.findById(1);
		assertTrue("Se obtuvo el departamento", Emp != null);
	}

	@Test
	public void test_4_GetAll() {
		List<Employee> allEmp = this.employeeRepository.findAll();
		assertTrue("Se obtuvieron todos los departamentos", allEmp.size() >= 0);
	}
	
	

	@Test
	public void test_5_ShowName() {
		List<Employee> allEmployees = this.employeeRepository.findAll();
		allEmployees = this.employeeRepository.findByFirstName("Matias");
		EmployeeConverter.convertToListDTO(allEmployees);
		assertTrue("Se obtuvo el nombre del empleado", allEmployees != null);
	}

	@Test
	public void test_6_GetEveryDepartmentEmployee() {
		List<Employee> allEmployees = this.employeeRepository.findByFirstName("Matias");
		EmployeeConverter.convertToListDTO(allEmployees);
		assertTrue("Se obtuvo los empleados de cada departamento", allEmployees != null);
	}

}
