package com.neoris.lab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.lab.converters.TitleConverter;
import com.neoris.lab.dto.TitleDTO;
import com.neoris.lab.entities.Title;
import com.neoris.lab.repository.TitleRepository;
import com.neoris.lab.service.TitleService;

@Service("TitleService")
public class TitleServiceImpl implements TitleService {

	@Autowired
	private TitleRepository titleRepository;

	@Override
	public TitleDTO save(TitleDTO titl) {
		Title title = TitleConverter.convertToEntity(titl);
		title = this.titleRepository.save(title);
		return TitleConverter.convertToDTO(title);
	}

	@Override
	public TitleDTO update(TitleDTO titl) {
		Title title = TitleConverter.convertToEntity(titl);
		title = this.titleRepository.save(title);
		return TitleConverter.convertToDTO(title);
	}

	@Override
	public void delete(Integer titleId) {
		this.titleRepository.deleteById(titleId);

	}

	@Override
	public TitleDTO findById(Integer titleId) {
		Title title = this.titleRepository.findByEmpNo(1);
		return TitleConverter.convertToDTO(title);
	}

	@Override
	public List<TitleDTO> findAll() {
		List<Title> allTitles = this.titleRepository.findAll();
		return TitleConverter.convertToListDTO(allTitles);
	}

}
