package com.neoris.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.lab.converters.SalarieConverter;
import com.neoris.lab.dto.SalarieDTO;
import com.neoris.lab.entities.Salarie;
import com.neoris.lab.repository.SalarieRepository;
import com.neoris.lab.service.SalarieService;

@Service("SalarieService")
public class SalarieServiceImpl implements SalarieService {

	@Autowired
	private SalarieRepository salarieRepository;

	@Override
	public SalarieDTO save(SalarieDTO sal) {
		Salarie salary = SalarieConverter.convertToEntity(sal);
		salary = this.salarieRepository.save(salary);
		return SalarieConverter.convertToDTO(salary);
	}

	@Override
	public SalarieDTO update(SalarieDTO sal) {
		Salarie salary = SalarieConverter.convertToEntity(sal);
		salary = this.salarieRepository.save(salary);
		return SalarieConverter.convertToDTO(salary);
	}

	@Override
	public void delete(Integer salaryId) {
		 this.salarieRepository.deleteById(salaryId);

	}

	@Override
	public SalarieDTO findById(Integer salaryId) {
		Salarie salari = this.salarieRepository.findByEmpNo(salaryId);
		return SalarieConverter.convertToDTO(salari);
	}

	@Override
	public List<SalarieDTO> findAll() {
		List<Salarie> allSalaries = this.salarieRepository.findAll();
		return SalarieConverter.convertToListDTO(allSalaries);
	}
}
