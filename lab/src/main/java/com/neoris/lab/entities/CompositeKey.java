package com.neoris.lab.entities;

import java.io.Serializable;
import java.util.Objects;

public class CompositeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 162963221308773791L;

	private Integer empNo;
	private Integer deptNo;
//	private Integer salary;

	public CompositeKey() {
	}

	public CompositeKey(Integer empNo, Integer deptNo, Integer salary) {
		this.empNo = empNo;
		this.deptNo = deptNo;
//		this.salary = salary;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CompositeKey deptNo1 = (CompositeKey) o;
		if (empNo != deptNo1.empNo)
			return false;
		return deptNo == deptNo1.deptNo;
	}

/*	public boolean equals1(Object u) {
		if (this == u)
			return true;
		if (u == null || getClass() != u.getClass())
			return false;
		CompositeKey salary1 = (CompositeKey) u;
		if (empNo != salary1.empNo)
			return false;
		return salary == salary1.salary;
	}*/

	@Override
	public int hashCode() {
		return Objects.hash(empNo, deptNo);
	}

}
