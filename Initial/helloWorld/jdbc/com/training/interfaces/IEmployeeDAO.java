package com.training.interfaces;

import java.util.List;

import com.training.bean.Employee;

public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee);
	public Employee getEmployee(int empId);
	public boolean updateEmployee(int empId, double newSalary);
	public boolean deleteEmployee(int empId);
	public List<Employee> getAllEmployee();
}
