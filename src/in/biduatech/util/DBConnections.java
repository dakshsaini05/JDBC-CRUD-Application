package in.biduatech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnections {
	private static final String DBURL = "jdbc:mysql://localhost:3306/studentdb";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "daksh@123";
	
	private DBConnections() {
		
	}
	
	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException {
		if(connection == null) {
			connection = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		}
		
		return connection;
	}
}
