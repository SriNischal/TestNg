package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBase {
	
	
	
	public  Connection loading() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		
		System.out.println("Driver loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://ATMECSINDT-006\\SQLEXPRESS;database=Data;integratedSecurity=true;");
	              
		return con;
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return null;
		

	}
}