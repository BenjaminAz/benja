package com.neoris.lab.dto;

import java.io.Serializable;
import java.util.List;

public class DepartmentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1011541251883224639L;
	private Integer deptNo;
	private String deptName;
	private List<DeptManagerDTO> deptManagerDTOs;

	public DepartmentDTO() {
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<DeptManagerDTO> getDeptManagerDTOs() {
		return deptManagerDTOs;
	}

	public void setDeptManagerDTOs(List<DeptManagerDTO> deptManagerDTOs) {
		this.deptManagerDTOs = deptManagerDTOs;
	}
}
