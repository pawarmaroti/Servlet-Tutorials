package com.maroti.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookies extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
	Cookie first_name = new Cookie("first_name", req.getParameter("first_name"));
	Cookie last_name = new Cookie("last_name", req.getParameter("last_name"));
	
	first_name.setMaxAge(60*60*24);
	last_name.setMaxAge(60*60*24);
	
	resp.addCookie(first_name);
	resp.addCookie(last_name);
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	String title = "Setting Cookies Example";
	String docType =
			"<!doctype html public \"-//w3c//dtd html 4.0 " +
			"transitional//en\">\n";
			out.println(docType +
			"<html>\n" +
			"<head><title>" + title + "</title></head>\n" +
			"<body bgcolor=\"#f0f0f0\">\n" +
			"<h1 align=\"center\">" + title + "</h1>\n" +
			"<ul>\n" +
			" <li><b>First Name</b>: "
			+ req.getParameter("first_name") + "\n" +
			" <li><b>Last Name</b>: "
			+ req.getParameter("last_name") + "\n" +
			"</ul>\n" +
			"</body></html>");
	
	}
	

}
