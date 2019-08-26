package com.neoris.lab.entities;

import java.io.Serializable;
import java.util.Date;

public class CompositeKey3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5307880238144226273L;
	private Integer empNo;
	private Date fromDate;
	private String title;

	public CompositeKey3() {
	}

	public CompositeKey3(Integer empNo, String title, Date fromDate) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
