package com.neoris.lab.dto;

import java.io.Serializable;
import java.util.Date;

public class DeptEmpDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4199564466968968514L;
	private Integer empNo;
	private Integer deptNo;
	private Date fromDate;
	private Date toDate;

	public DeptEmpDTO() {
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
