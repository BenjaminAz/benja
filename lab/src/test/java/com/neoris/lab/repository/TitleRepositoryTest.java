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
import com.neoris.lab.converters.TitleConverter;
import com.neoris.lab.entities.Title;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleRepositoryTest {

	@Autowired
	private TitleRepository titleRepository;

	@Test
	public void test_1_Save() {
		Title titulo = new Title();
		titulo.setTitle("Carlos");
		titulo.setFromDate(new Date());
		titulo.setToDate(new Date());
		titulo = this.titleRepository.save(titulo);
		assertTrue("Se registró el titulo", titulo.getEmpNo() != null);
	}

	@Test
	public void test_2_Update() {
		Title titulo = new Title();
		titulo.setTitle("Inercia");
		titulo.setFromDate(new Date());
		titulo.setToDate(new Date());
		titulo = this.titleRepository.save(titulo);
		assertTrue("Se modificó el titulo", titulo.getTitle() != null);
	}

	@Test
	public void test_3_GetById() {
		Title titulo = this.titleRepository.findByEmpNo( 1);
		assertTrue("Se obtuvo el titulo", titulo != null);
	}

	@Test
	public void test_4_GetAll() {
		List<Title> allTitles = this.titleRepository.findAll();
		assertTrue("Se obtuvieron todos los departamentos", allTitles.size() >= 0);
	}
	
	@Test
	public void test_5_GetEveryTitleEmployee() {
		List<Title> allTitles = this.titleRepository.findByTitle("asd");
		TitleConverter.convertToListDTO(allTitles);
		assertTrue("Se obtuvo los titulos de cada empleado", allTitles != null);
	}

	@Test
	public void test_6_GetEveryTitleEmployeeFromDateToDate() {
		Title titulo = new Title();
		titulo.setTitle("Hola");
		titulo.setFromDate(new Date());
		titulo.setToDate(new Date());
		List<Title> allTitles = this.titleRepository.findByTitle("Chau");
		TitleConverter.convertToListDTO(allTitles);
		assertTrue("Se obtuvo los titulos de cada empleado desde " + titulo.getFromDate() + " hasta "
				+ titulo.getToDate(), allTitles != null);
	}
	
}
