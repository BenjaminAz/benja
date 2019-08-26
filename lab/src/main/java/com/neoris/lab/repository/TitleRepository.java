package com.neoris.lab.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.lab.entities.Title;

public interface TitleRepository extends JpaRepository<Title, Integer> {

	Title findByEmpNoAndTitleAndFromDate(Integer EmpNo, String Title, Date fromDate);

	Title findByFromDateAndTitleAndEmpNo(Date fromDate, String title, Integer empNo);
	
	Title findByEmpNo(Integer empNo);

	List<Title> findByTitle(String title);
}
