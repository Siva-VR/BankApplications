package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbClass {
	static Connection con;

	public static Connection getCon() {
		try {
			String url = "com.mysql.cj.jdbc.Driver";
			String dburl = "jdbc:mysql://localhost:3306/shiva";
			String uname = "root";
			String password = "";
			Class.forName(url);

			con = DriverManager.getConnection(dburl, uname, password);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		return con;

	}

}
