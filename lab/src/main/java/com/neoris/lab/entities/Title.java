package com.neoris.lab.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "titles")
@IdClass(CompositeKey3.class)
public class Title {

	
	@Id
	@Column(name = "emp_no", nullable = false)
	private Integer empNo;

	@Id
	@Column(name = "title", nullable = false)
	private String title;

	@Id
	@Column(name = "from_date", nullable = false)
	private Date fromDate;

	@Column(name = "to_date", nullable = false)
	private Date toDate;

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
