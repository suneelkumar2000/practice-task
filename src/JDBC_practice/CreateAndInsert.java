package JDBC_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateAndInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "suneel123");
			Statement stmt = con.createStatement();

			String q = "create table Department(Dept_no int(10),Name char(20))";
			stmt.executeUpdate(q);
			String q1 = "insert into Department values(10,'Mee')";
			stmt.executeUpdate(q1);
			String q2 = "insert into Department values(20,'Vee')";
			stmt.executeUpdate(q2);

			ResultSet rs = stmt.executeQuery("select * from Department");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
