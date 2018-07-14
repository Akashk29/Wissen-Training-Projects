package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory {
	
	
	static {
		
		//DriverManager.registerDriver(new Driver());
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	}

	public static Connection getConnection() throws SQLException {
		
		
		
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String user = "root";
		String password = "admin";
		
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
}
