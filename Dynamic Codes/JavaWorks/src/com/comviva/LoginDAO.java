package com.comviva;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO implements ILoginDAO {
	@Override
	public List<Table> checkRecord() {
		String sql = "select * from logindetails;";
		List<Table> list = new ArrayList<>();

		GetConnection gc = new GetConnection();

		try {
			gc.ps = GetConnection.getMysqlCon().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			while (gc.rs.next()) {
				Table temp = new Table();
				temp.setUser(gc.rs.getString(1));
				temp.setPass(gc.rs.getString(2));
				list.add(temp);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
