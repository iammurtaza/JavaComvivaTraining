package com.training.client;

import java.util.List;

import com.training.bean.Employee;
import com.training.dao.EmployeeDAO;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO();
		// Employee employee = new Employee(228, "Warsaw", 34433);
		// Employee employee2 = new Employee(229, "Tarsaw", 14433);
		// Employee employee3 = new Employee(235, "Xarsaw", 24433);
		// boolean flag = dao.insertEmployee(employee);
		// boolean flagx = dao.insertEmployee(employee2);
		// boolean flagy = dao.insertEmployee(employee3);
		// System.out.println(flagx ? "Inserted" : "Not Inserted");
		// boolean flag2 = dao.deleteEmployee(229);
		// System.out.println(flag2 ? "Deleted" : "Not Deleted");

		// Employee emp = dao.getEmployee(222);
		// System.out.println(emp.toString());

		boolean flag = dao.updateEmployee(228, 99999.9);
		System.out.println(flag ? "Updated" : "Not Updated");

		List<Employee> list = dao.getAllEmployee();

		for (Employee temp : list) {
			System.out.println(temp.getEmpId());
			System.out.println(temp.getEmpName());
			System.out.println(temp.getEmpSal());
			System.out.println("-----------------");
		}
	}
}
