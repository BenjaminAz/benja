package com.neoris.lab.dto;

import java.io.Serializable;
import java.util.Date;

public class TitleDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2878751585392211701L;
	private Integer empNo;
	private String title;
	private Date fromDate;
	private Date toDate;

	public TitleDTO() {
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
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
}
