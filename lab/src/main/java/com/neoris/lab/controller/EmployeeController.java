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

import com.neoris.lab.dto.EmployeeDTO;
import com.neoris.lab.service.EmployeeService;

@Controller
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<EmployeeDTO> save(@RequestBody EmployeeDTO dpto) {
		EmployeeDTO dto = this.employeeService.save(dpto);
		return new ResponseEntity<EmployeeDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<EmployeeDTO> update(@RequestBody EmployeeDTO dpto) {
		EmployeeDTO dto = this.employeeService.save(dpto);
		return new ResponseEntity<EmployeeDTO>(dto, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{dptoId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> delete(@RequestParam Integer dptoId) {
		this.employeeService.delete(dptoId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{dptoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<EmployeeDTO> findById(@RequestParam Integer dptoId) {
		EmployeeDTO dto = this.employeeService.findById(dptoId);
		return new ResponseEntity<EmployeeDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<EmployeeDTO>> findByAll() {
		List<EmployeeDTO> dto = this.employeeService.findAll();
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/names", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<String>> showEmpName() {
		List<String> listDto = this.employeeService.showName();
		return new ResponseEntity<>(listDto, HttpStatus.OK);
	}
}
