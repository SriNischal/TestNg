package test;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
	public Statement insert() {
		try {
			Scanner sc = new Scanner(System.in);
			Connection con = new DataBase().loading();
			java.sql.Statement stmt = con.createStatement();
			
			int id=sc.nextInt();
			
			((java.sql.Statement) stmt).executeUpdate("INSERT INTO StudentData " + 
	                "VALUES (3, 22, 'Suraj')");
			System.out.println("Data inserted");
			return stmt;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

		
	}

}
