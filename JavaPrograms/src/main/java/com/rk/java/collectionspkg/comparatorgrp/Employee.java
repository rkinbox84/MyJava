package com.rk.java.collectionspkg.comparatorgrp;

import java.util.Date;

public class Employee {
	
	private Long employeeId;
    private String firstName = null;
    private String lastName = null;
    private Double fte;
    private Date hireDate;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
	public Double getFte() {
		return fte;
	}
	public void setFte(Double fte) {
		this.fte = fte;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
	public Employee(Long employeeId, String firstName, String lastName, Double fte, Date hireDate) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fte = fte;
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", fte="
				+ fte + ", hireDate=" + hireDate + "]";
	}

	
	
	
}
