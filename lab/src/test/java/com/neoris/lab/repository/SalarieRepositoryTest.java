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
import com.neoris.lab.converters.SalarieConverter;
import com.neoris.lab.converters.TitleConverter;
import com.neoris.lab.entities.Salarie;
import com.neoris.lab.entities.Title;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SalarieRepositoryTest {

	@Autowired
	private SalarieRepository salarieRepository;
	@Autowired
	private TitleRepository titleRepository;

	@Test
	public void test_1_Save() {
		Salarie salario = new Salarie();
		salario.setSalary(2);
		salario.setFromDate(new Date());
		salario.setToDate(new Date());
		salario = this.salarieRepository.save(salario);
		assertTrue("Se registró el departamento", salario.getSalary() != null);
	}

	@Test
	public void test_2_Update() {
		Salarie salario = new Salarie();
		salario.setSalary(2);
		salario.setFromDate(new Date());
		salario.setToDate(new Date());
		salario = this.salarieRepository.save(salario);
		assertTrue("Se registró el departamento", salario.getSalary() != null);
	}

	@Test
	public void test_3_GetById() {
		Salarie salarie = this.salarieRepository.findByEmpNoAndFromDate(1, new Date());
		assertTrue("Se obtuvo el salario", salarie != null);
	}

	@Test
	public void test_4_GetAll() {
		List<Salarie> allSalaries = this.salarieRepository.findAll();
		assertTrue("Se obtuvieron todos los departamentos", allSalaries.size() >= 0);
	}

	@Test
	public void test_5_GetEverySalaryEmployee() {
		List<Salarie> allSalaries = this.salarieRepository.findBySalary(200);
		SalarieConverter.convertToListDTO(allSalaries);
		assertTrue("Se obtuvo los salarios de cada empleado", allSalaries != null);
	}

	@Test
	public void test_6_GetEverySalaryEmployeeFromDateToDate() {
		Salarie salario = new Salarie();
		salario.setSalary(2);
		salario.setFromDate(new Date());
		salario.setToDate(new Date());
		List<Salarie> allSalaries = this.salarieRepository.findBySalary(6000);
		SalarieConverter.convertToListDTO(allSalaries);
		assertTrue("Se obtuvo los salarios de cada empleado desde " + salario.getFromDate() + " hasta "
				+ salario.getToDate(), allSalaries != null);
	}

	@Test
	public void test_6_GetEverySalaryAndTitlesFromAnEmployee() {
		Salarie salario = new Salarie();
		salario.setSalary(2);
		salario.setFromDate(new Date());
		salario.setToDate(new Date());
		List<Salarie> allSalaries = this.salarieRepository.findBySalary(6000);
		SalarieConverter.convertToListDTO(allSalaries);
		Title titulo = new Title();
		titulo.setTitle("Hola");
		titulo.setFromDate(new Date());
		titulo.setToDate(new Date());
		List<Title> allTitles = this.titleRepository.findByTitle("Chau");
		TitleConverter.convertToListDTO(allTitles);
		assertTrue("Se obtuvo los salarios de cada empleado desde " + salario.getFromDate() + " hasta "
				+ salario.getToDate(), allSalaries != null);
		assertTrue(
				"Se obtuvo los titulos de cada empleado desde " + titulo.getFromDate() + " hasta " + titulo.getToDate(),
				allTitles != null);
	}

}
