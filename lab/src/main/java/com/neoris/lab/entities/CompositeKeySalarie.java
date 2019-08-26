package com.neoris.lab.entities;

import java.io.Serializable;
import java.util.Date;

public class CompositeKeySalarie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5587623562407279757L;
	private Integer empNo;
	private Date fromDate;

	public CompositeKeySalarie(Integer empNo, Date fromDate) {
		this.empNo = empNo;
		this.fromDate = fromDate;
	}

	public CompositeKeySalarie() {
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

}
