package com.neoris.lab.entities;

import java.io.Serializable;
import java.util.Date;

public class MyCompositeKeyTitle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer empNo;
	private String title;
	private Date fromDate;

	
	public MyCompositeKeyTitle() {
		super();
	}

	public MyCompositeKeyTitle(String title, Date fromDate, Integer empNo) {
		this.empNo = empNo;
		this.title = title;
		this.fromDate = fromDate;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
}
