package com.servlet.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.util.DbConn;

public class DatabaseAccess extends HttpServlet{
	
	private Connection con;
	public void init(ServletConfig config) throws ServletException {
	
		String username=config.getInitParameter("username");
		String pass=config.getInitParameter("password");
		ServletContext  context=config.getServletContext();
		String driver=context.getInitParameter("driver");
		String url=context.getInitParameter("url");
		try{
			con=DbConn.getConn(username, pass, url, driver);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		try {
			String sql="select * from user";
			PreparedStatement smt=con.prepareStatement(sql);
			ResultSet rs=smt.executeQuery();
			out.print("<html>");
			out.print("<body>");
			out.print("<table style='border:1px solid black'; background:ff8545>");
			out.print("<tr style='border:1px solid black'>"+
						"<td>"+"ID"+"</td>"+
						"<td>"+"Name"+"</td>"+
						"<td>"+"Address"+"</td>"+
					"</tr>");
			
			while(rs.next())
			{
				out.println(
						"<tr style='border:1px solid black'>"+
								"<td>"+rs.getInt(1)+"</td>"+
								"<td>"+rs.getString(2)+"</td>"+
								"<td>"+rs.getString(3)+"</td>"+
						"</tr>"
				
						
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		out.print("<html>");
		out.print("<body>");
	}
	

}
