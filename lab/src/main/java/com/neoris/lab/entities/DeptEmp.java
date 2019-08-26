package com.neoris.lab.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.neoris.lab.entities.CompositeKey;

@Entity
@Table(name = "dept_emp")
@IdClass(CompositeKey.class)
public class DeptEmp {

	@Id
	@Column(name = "emp_no", nullable = false)
	private Integer empNo;

	@Id
	@Column(name = "dept_no", nullable = false)
	private Integer deptNo;

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
