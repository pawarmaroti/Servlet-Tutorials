package com.servlet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	private static Connection con;
	
	public static Connection getConn(String userName, String pass, String url, String driver)
	{
		try {
		
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,pass);
			System.out.println("Connection started............!");
		}catch (Exception e) {
			
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return con;
	}
	/*public static void main(String[] args) {
		
		String userName="root";
		String pass="root";
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test ";
		
		getConn(userName, pass, url, driver);
		
	}*/
}
