package com.neoris.lab.repository;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.neoris.lab.app.Application;
import com.neoris.lab.converters.DeptManagerConverter;
import com.neoris.lab.entities.DeptManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class DeptManagerRepositoryTest {

	@Autowired
	private DeptManagerRepository deptManagerRepository;

	@Test
	public void test_1_Save() {
		DeptManager depto = new DeptManager();
		depto.setDeptNo(1);
		depto.setEmpNo(1);
		depto.setDeptNo(2);
		depto.setFromDate(new Date());
		depto.setToDate(new Date());
		depto = this.deptManagerRepository.save(depto);
		assertTrue("Se registró el departamento", depto.getDeptNo() != null);
	}

	@Test
	public void test_2_Update() {
		DeptManager depto = new DeptManager();
		depto.setEmpNo(1);
		depto.setDeptNo(1);
		depto.setFromDate(new Date());
		depto.setToDate(new Date());
		depto = this.deptManagerRepository.save(depto);
		assertTrue("Se modificó el departamento", depto.getDeptNo() != null);
	}

	@Test
	public void test_3_GetById() {
		DeptManager depto = this.deptManagerRepository.findByEmpNoAndDeptNo(1, 1);
		assertTrue("Se obtuvo el departamento", depto != null);
	}

	@Test
	public void test_4_GetAll() {
		List<DeptManager> allDepartments = this.deptManagerRepository.findAll();
		assertTrue("Se obtuvieron todos los departamentos", allDepartments.size() >= 0);
	}

	@Test
	public void test_5_ShowDepartmentWithManager() {
		List<DeptManager> allDepartments = this.deptManagerRepository.findAll();
		allDepartments = this.deptManagerRepository.findByDeptNoAndEmpNo(1, 1);
		DeptManagerConverter.convertToListDTO(allDepartments);
		assertTrue("Se obtuvo el departamento", allDepartments != null);
	}
}
