package com.neoris.lab.dto;

import java.io.Serializable;
import java.util.Date;

import com.neoris.lab.entities.genderEnum;

public class EmployeeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9154912553274316177L;
	
	private Integer empNo;
	
	private Date birthDate;
	
	private String firstName;
	
	private String lastName;
	
	private genderEnum gender;
	
	private Date hireDate;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public genderEnum getGender() {
		return gender;
	}

	public void setGender(genderEnum gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
