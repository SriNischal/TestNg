package test;

import java.sql.Connection;
import java.util.Scanner;

public class Delete {
	public void deleteData() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection con = new DataBase().loading();
			java.sql.Statement stmt = con.createStatement();
			stmt.execute("DELETE FROM StudentData WHERE id=1");
			System.out.println("Data Deleted");
			con.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}

}
