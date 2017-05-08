package com.maroti.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Approch3Client extends HttpServlet {
	
	private String user;
	
	
	public void init(ServletConfig config) throws ServletException {
	
		user=config.getInitParameter("user");
	}
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>"+user+"</h1>");
		out.print("</body>");
		out.print("</html>");

		
	}

}
