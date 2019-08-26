package com.neoris.lab.converters;

import java.util.ArrayList;
import java.util.List;

import com.neoris.lab.dto.SalarieDTO;
import com.neoris.lab.entities.Salarie;

public class SalarieConverter {

	public static SalarieDTO convertToDTO(Salarie salary) {
		SalarieDTO dto = new SalarieDTO();
		dto.setEmpNo(salary.getEmpNo());
		dto.setSalary(salary.getSalary());
		dto.setFromDate(salary.getFromDate());
		dto.setToDate(salary.getToDate());

		return dto;
	}

	public static Salarie convertToEntity(SalarieDTO dto) {
		Salarie sala = new Salarie();
		sala.setEmpNo(dto.getEmpNo());
		sala.setSalary(dto.getSalary());
		sala.setFromDate(dto.getFromDate());
		sala.setToDate(dto.getToDate());
		return sala;
	}

	public static List<SalarieDTO> convertToListDTO(List<Salarie> allSalaries) {
		List<SalarieDTO> allSalariesDTO = new ArrayList<SalarieDTO>();
		for (Salarie salary : allSalaries) {
			SalarieDTO salar = convertToDTO(salary);
			allSalariesDTO.add(salar);
		}

		return allSalariesDTO;
	}
}
