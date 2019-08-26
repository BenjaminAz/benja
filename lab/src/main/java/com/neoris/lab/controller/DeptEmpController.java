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

import com.neoris.lab.dto.DeptEmpDTO;
import com.neoris.lab.service.DeptEmpService;

@Controller
@RequestMapping("/api/deptEmp")
public class DeptEmpController {

	@Autowired
	private DeptEmpService deptEmpService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DeptEmpDTO> save(@RequestBody DeptEmpDTO dpto) {
		DeptEmpDTO dto = this.deptEmpService.save(dpto);
		return new ResponseEntity<DeptEmpDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DeptEmpDTO> update(@RequestBody DeptEmpDTO dpto) {
		DeptEmpDTO dto = this.deptEmpService.save(dpto);
		return new ResponseEntity<DeptEmpDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{deptEmpId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> delete(@RequestParam Integer deptEmp) {
		this.deptEmpService.delete(deptEmp);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{deptEmpId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DeptEmpDTO> findById(@RequestParam Integer deptEmp) {
		DeptEmpDTO dto = this.deptEmpService.findById(deptEmp);
		return new ResponseEntity<DeptEmpDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<DeptEmpDTO>> findAll() {
		List<DeptEmpDTO> dto = this.deptEmpService.findAll();
		return new ResponseEntity<List<DeptEmpDTO>>(dto, HttpStatus.OK);
	}
	
}
