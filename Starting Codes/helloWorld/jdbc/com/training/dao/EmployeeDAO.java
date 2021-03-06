package com.training.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.bean.Employee;
import com.training.connection.GetConnection;
import com.training.interfaces.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public boolean insertEmployee(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);

			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setDouble(3, employee.getEmpSal());
			return gc.ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select empid, empname, empsal"
				+ " from employee where empid=?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);
			gc.ps.setInt(1, empId);

			gc.rs = gc.ps.executeQuery();

			if (gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmpSal(gc.rs.getDouble(3));

				return employee;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateEmployee(int empId, double newSalary) {
		String sql = "update employee set empsal=? where empid=?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);

			gc.ps.setDouble(1, newSalary);
			gc.ps.setInt(2, empId);
			return gc.ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String sql = "delete from employee where empid=?";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			return gc.ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		String sql = "select empid, empname, empsal from employee";
		List<Employee> list = new ArrayList<>();
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();

			while (gc.rs.next()) {
				Employee temp = new Employee();

				temp.setEmpId(gc.rs.getInt(1));
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble(3));

				list.add(temp);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
