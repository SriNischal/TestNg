package test;

import java.sql.Connection;
import java.sql.ResultSet;

public class Fetch {
	public Connection fetchData() {
		try {
			Connection con = new DataBase().loading();
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from StudentData");
			while (rs.next())
				System.out.println(
						rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
