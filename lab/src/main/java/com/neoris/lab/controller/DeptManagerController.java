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

import com.neoris.lab.dto.DeptManagerDTO;
import com.neoris.lab.service.DeptManagerService;

@Controller
@RequestMapping("/api/deptManager")
public class DeptManagerController {

	@Autowired
	private DeptManagerService deptManagerService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DeptManagerDTO> save(@RequestBody DeptManagerDTO manager) {
		DeptManagerDTO deptManager = this.deptManagerService.save(manager);
		return new ResponseEntity<>(deptManager, HttpStatus.CREATED);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DeptManagerDTO> update(@RequestBody DeptManagerDTO manager) {
		DeptManagerDTO deptManager = this.deptManagerService.save(manager);
		return new ResponseEntity<>(deptManager, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{deptManagerId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> delete(@RequestParam Integer deptManagerId) {
		this.deptManagerService.delete(deptManagerId, deptManagerId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{deptManagerId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<DeptManagerDTO> findById(@RequestParam Integer deptManagerId) {
		DeptManagerDTO dto = this.deptManagerService.findById(deptManagerId, deptManagerId);
		return new ResponseEntity<DeptManagerDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<DeptManagerDTO>> findAll() {
		List<DeptManagerDTO> deptManager = this.deptManagerService.findAll();
		return new ResponseEntity<>(deptManager, HttpStatus.OK);
	}
}
