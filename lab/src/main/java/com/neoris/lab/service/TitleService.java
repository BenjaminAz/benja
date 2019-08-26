package com.neoris.lab.service;

import java.util.List;

import com.neoris.lab.dto.TitleDTO;

public interface TitleService {

	TitleDTO save(TitleDTO titl);

	TitleDTO update(TitleDTO titl);

	void delete(Integer titlId);

	TitleDTO findById(Integer titlId);

	List<TitleDTO> findAll();

	
}
