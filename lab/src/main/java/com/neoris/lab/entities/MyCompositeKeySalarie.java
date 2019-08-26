package com.neoris.lab.entities;

import java.io.Serializable;
import java.util.Date;

public class MyCompositeKeySalarie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 626954969143072834L;
	private Integer empNo;
	private Date fromDate;

	public MyCompositeKeySalarie() {

	}

	public MyCompositeKeySalarie(Date fromDate, Integer empNo) {
		super();
		this.empNo = empNo;
		this.fromDate = fromDate;
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
