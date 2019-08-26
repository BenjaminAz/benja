package com.neoris.lab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.neoris.lab.dto.DepartmentDTO;

import com.neoris.lab.service.DepartmentService;


@Controller
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DepartmentDTO> save(@RequestBody  DepartmentDTO dpto) {
		DepartmentDTO dto = this.departmentService.save(dpto);
		return new ResponseEntity<DepartmentDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DepartmentDTO> update(@RequestBody DepartmentDTO dpto) {
		DepartmentDTO dto = this.departmentService.save(dpto);
		return new ResponseEntity<DepartmentDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = " /{dptoId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> delete(@PathVariable Integer dptoId) {
		this.departmentService.delete(dptoId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{dptoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DepartmentDTO> findById(@PathVariable Integer dptoId) {
		DepartmentDTO dto = this.departmentService.findById(dptoId);
		return new ResponseEntity<DepartmentDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<DepartmentDTO>> findAll() {
		List<DepartmentDTO> listDto = this.departmentService.findAll();
		return new ResponseEntity<List<DepartmentDTO>>(listDto, HttpStatus.OK);
	}
}
