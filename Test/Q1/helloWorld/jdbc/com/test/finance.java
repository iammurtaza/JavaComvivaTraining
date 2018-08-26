package com.test;

import java.sql.SQLException;

public class finance extends Thread implements IEmployeeDAO{
	int empid;
	String empname;
	String deptname;
	
	public finance(int empid, String empname, String deptname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptname = deptname;
	}

	
	@Override
	public void run() {
		insertEmployee();
	}


	@Override
	public boolean insertEmployee() {
		String sql = "insert into employees values(?,?,?)";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);

			gc.ps.setInt(1, this.empid);
			gc.ps.setString(2, this.empname);
			gc.ps.setString(3, this.deptname);
			return gc.ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
