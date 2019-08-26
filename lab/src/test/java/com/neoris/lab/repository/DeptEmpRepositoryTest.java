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
import com.neoris.lab.entities.DeptEmp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class DeptEmpRepositoryTest {

	@Autowired
	private DeptEmpRepository deptEmpRepository;

	@Test
	public void test_1_Save() {
		DeptEmp deptoEmp = new DeptEmp();
		deptoEmp.setEmpNo(1);
		deptoEmp.setDeptNo(1);
		deptoEmp.setFromDate(new Date());
		deptoEmp.setToDate(new Date());
		deptoEmp = this.deptEmpRepository.save(deptoEmp);
		assertTrue("Se registró el departamento", deptoEmp.getDeptNo() != null);
	}

	@Test
	public void test_2_Update() {
		DeptEmp deptoEmp = new DeptEmp();
		deptoEmp.setEmpNo(1);
		deptoEmp.setDeptNo(1);
		deptoEmp.setFromDate(new Date());
		deptoEmp.setToDate(new Date());
		deptoEmp = this.deptEmpRepository.save(deptoEmp);
		assertTrue("Se modificó el departamento", deptoEmp.getDeptNo() != null);
	}

	@Test
	public void test_3_GetById() {
		DeptEmp deptoEmp = this.deptEmpRepository.findByEmpNoAndDeptNo(1, 1);
		assertTrue("Se obtuvo el departamento", deptoEmp != null);
	}

	@Test
	public void test_4_GetAll() {
		List<DeptEmp> allDepartments = this.deptEmpRepository.findAll();
		assertTrue("Se obtuvieron todos los departamentos", allDepartments.size() >= 0);
	}
}
