package com.maroti.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Approch2Client extends GenericServlet {
	private String user;
	@Override
	public void init(ServletConfig config) throws ServletException {
		user=config.getInitParameter("user");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	out.print("<h>"+"You Clicked User : " + user+"</h>");
	out.print("</body>");
	out.print("</html>");
		// TODO Auto-generated method stub
		
	}

}
