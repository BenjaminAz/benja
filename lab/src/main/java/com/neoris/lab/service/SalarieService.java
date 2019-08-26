package com.neoris.lab.service;

import java.util.List;

import com.neoris.lab.dto.SalarieDTO;

public interface SalarieService {

	SalarieDTO save(SalarieDTO salary);

	SalarieDTO update(SalarieDTO salary);

	void delete(Integer dptoId);

	SalarieDTO findById(Integer dptoId);

	List<SalarieDTO> findAll();

}
