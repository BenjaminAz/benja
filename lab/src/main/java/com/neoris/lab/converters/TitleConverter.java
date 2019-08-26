package com.neoris.lab.converters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neoris.lab.dto.TitleDTO;
import com.neoris.lab.entities.Title;

public class TitleConverter {

	public static TitleDTO convertToDTO(Title title) {
		TitleDTO dto = new TitleDTO();
		dto.setEmpNo(title.getEmpNo());
		dto.setTitle(title.getTitle());
		dto.setFromDate(new Date());
		dto.setToDate(new Date());

		return dto;
	}
	
	public static Title convertToEntity(TitleDTO dto) {
		Title titl = new Title();
		titl.setEmpNo(dto.getEmpNo());
		titl.setTitle(dto.getTitle());
		titl.setFromDate(dto.getFromDate());
		titl.setToDate(dto.getToDate());
		return titl;
	}

	public static List<TitleDTO> convertToListDTO(List<Title> allTitles) {
		List<TitleDTO> allTitlesDTO = new ArrayList<TitleDTO>();
		for (Title titulo : allTitles) {
			TitleDTO tit = convertToDTO(titulo);
			allTitlesDTO.add(tit);
		}
		return allTitlesDTO;
	}
	
}
