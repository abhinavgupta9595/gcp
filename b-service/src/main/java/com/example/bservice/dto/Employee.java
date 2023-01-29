package com.example.bservice.dto;

public class Employee {

	private int empNumber;
	
	private int empId;
	
	private String empName;

	public Employee(int empNumber, int empId, String empName) {
		super();
		this.empNumber = empNumber;
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
