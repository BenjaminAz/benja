package com.neoris.lab.dto;

import java.io.Serializable;
import java.util.Date;

public class SalarieDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5303556913109701152L;
	private Integer empNo;
	private Integer salary;
	private Date fromDate;
	private Date toDate;
	
	public SalarieDTO() {
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
