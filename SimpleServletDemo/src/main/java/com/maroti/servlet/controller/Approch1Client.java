package com.maroti.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*Approch1 Client: Creating servlet using implements approch*/

public class Approch1Client implements Servlet {

	private String user;
	public void init(ServletConfig config) throws ServletException {
	
		user=config.getInitParameter("user1");
		//init() method create object only one time when servlet loaded.
		System.out.println("User: "+user + "Servlet created object");
		
		
	}

	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		
		//Service() method run every request
		System.out.println("Service method executed...!");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>"+"You Click user : "+user+"</h1>");
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	}

    public ServletConfig getServletConfig() {
		
    	//Its get the servlet config object
		return this.getServletConfig();
	}

	public String getServletInfo() {
		
		//It show the servlet info
		return this.getServletInfo();
	}
	public void destroy() {
		
		//destroy() method run when object destruction time only one time
		System.out.println("Servlet Destroyed Object");
	}
	
}
