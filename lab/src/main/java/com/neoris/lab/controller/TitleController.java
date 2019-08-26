package com.neoris.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.neoris.lab.dto.TitleDTO;
import com.neoris.lab.service.TitleService;

@Controller
@RequestMapping("/api/title")
public class TitleController {

	@Autowired
	private TitleService titleService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TitleDTO> save(@RequestBody TitleDTO titl) {
		TitleDTO dto = this.titleService.save(titl);
		return new ResponseEntity<TitleDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TitleDTO> update(@RequestBody TitleDTO titl) {
		TitleDTO dto = this.titleService.save(titl);
		return new ResponseEntity<TitleDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{titlId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> delete(@RequestParam Integer titlId) {
		this.titleService.delete(titlId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{titlId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TitleDTO> findById(@RequestParam Integer titlId) {
		TitleDTO dto = this.titleService.findById(titlId);
		return new ResponseEntity<TitleDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<TitleDTO>> findAll() {
		List<TitleDTO> dto = this.titleService.findAll();
		return new ResponseEntity<List<TitleDTO>>(dto, HttpStatus.OK);
	}
	
	
}
