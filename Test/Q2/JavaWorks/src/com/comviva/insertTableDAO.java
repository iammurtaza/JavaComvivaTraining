package com.comviva;

import java.sql.SQLException;

public class insertTableDAO implements IinsertTableDAO {

	@Override
	public boolean insertEmployee(int empid, String empname, int empsal,
			String empemail) {
		String sql = "insert into employee values(?,?,?,?)";
		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);

			gc.ps.setInt(1, empid);
			gc.ps.setString(2, empname);
			gc.ps.setInt(3, empsal);
			gc.ps.setString(4, empemail);
			return gc.ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
