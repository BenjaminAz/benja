package com.neoris.lab.repository;

import static org.junit.Assert.*;
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
import com.neoris.lab.entities.Department;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentRepositoryTest {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Test
	public void test_1_Save() {
		Department depto = new Department();
		depto.setDeptNo(1);
		depto.setDeptName("Prueba de nuevo Departamento");
		depto = this.departmentRepository.save(depto);
		assertTrue("Se registró el departamento", depto.getDeptNo() != null);
	}

	@Test
	public void test_2_Update() {
		Department depto = new Department();
		depto.setDeptNo(1);
		depto.setDeptName("Prueba de nuevo Departamento");
		depto = this.departmentRepository.save(depto);
		assertTrue("Se modificó el departamento", depto.getDeptNo() != null);
	}

	@Test
	public void test_3_GetById() {
		Optional<Department> depto = this.departmentRepository.findById(3);
		assertTrue("Se obtuvo el departamento", depto != null);
	}

	@Test
	public void test_4_GetAll() {
		List<Department> allDepartments = this.departmentRepository.findAll();
		assertTrue("Se obtuvieron todos los departamentos", allDepartments.size() >= 0);
	}
}
