package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
	

	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3307/MyProject";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "9975302928";
	
	private Connection con;
	
	public Connection getconn()throws ClassNotFoundException, SQLException 
	{
		
		if(con == null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		return con;
		
	}
	
}
