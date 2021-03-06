package com.comviva.day4;

public class Employee {
	private int empId;
	private String empName;
	private double income;

	@Override
	public boolean equals(Object arg0) {
		Employee emp = (Employee) arg0;
		return emp.getEmpId() == this.empId && emp.getEmpName() == this.empName
				&& emp.getIncome() == this.income;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", income=" + income + "]";
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

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public Employee(int empId, String empName, double income) {
		this.empId = empId;
		this.empName = empName;
		this.income = income;
	}
}
