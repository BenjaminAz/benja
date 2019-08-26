package com.neoris.lab.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.neoris.lab.dto.SalarieDTO;
import com.neoris.lab.service.SalarieService;

@Controller
@RequestMapping("/api/salary")
public class SalarieController {

	@Autowired
	private SalarieService salarieService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SalarieDTO> save(@RequestBody SalarieDTO salary) {
		SalarieDTO dto = this.salarieService.save(salary);
		return new ResponseEntity<SalarieDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SalarieDTO> update(@RequestBody SalarieDTO salary) {
		SalarieDTO dto = this.salarieService.save(salary);
		return new ResponseEntity<SalarieDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{salaryId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> delete(@RequestParam Integer salaryId) {
		this.salarieService.delete(salaryId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{salaryId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<SalarieDTO> findById(@RequestParam Integer salaryId) {
		SalarieDTO dto = this.salarieService.findById(salaryId);
		return new ResponseEntity<SalarieDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<SalarieDTO>> findAll() {
		List<SalarieDTO> dto = this.salarieService.findAll();
		return new ResponseEntity<List<SalarieDTO>>(dto, HttpStatus.OK);
	}
}
