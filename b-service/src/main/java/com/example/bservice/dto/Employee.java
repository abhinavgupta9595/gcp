package com.example.bservice.dto;

public class Employee {
	private int empNum;
	private int empId;
	private String empName;
	public Employee(int empNum, int empId, String empName) {
		super();
		this.empNum = empNum;
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
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
