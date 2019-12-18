package com.rk.java.collectionspkg.comparatorImpl;

import java.util.List;

public class EmpDetailsBean {
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public Object getObj1() {
		return obj1;
	}
	public void setObj1(Object obj1) {
		this.obj1 = obj1;
	}
	
	List<Employee> empList;
	public EmpDetailsBean(List<Employee> empList, Object obj1) {
		super();
		this.empList = empList;
		this.obj1 = obj1;
	}

	Object obj1;

}
