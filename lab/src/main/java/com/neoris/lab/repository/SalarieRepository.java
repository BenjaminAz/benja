package com.neoris.lab.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.lab.entities.Salarie;

public interface SalarieRepository extends JpaRepository<Salarie, Integer> {

	Salarie findByEmpNoAndFromDate(Integer empNo, Date fromDate);

	Salarie findByEmpNo(Integer empNo);

	List<Salarie> findBySalary(Integer salary);
}
