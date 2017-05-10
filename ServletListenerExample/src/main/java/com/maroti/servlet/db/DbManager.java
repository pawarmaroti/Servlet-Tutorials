package com.maroti.servlet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static Connection con;
	
	@SuppressWarnings("static-access")
	public DbManager(String driver, String url, String username, String password)
	{
		this.driver=driver;
		this.url=url;
		this.username=username;
		this.password=password;
	}
	
	public  static Connection getConnection()
	{
		try {
			
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return con;
	}

	public void closeConnection() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
