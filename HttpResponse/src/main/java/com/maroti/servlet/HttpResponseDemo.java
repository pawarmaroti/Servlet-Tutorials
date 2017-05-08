package com.maroti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpResponseDemo extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
			String uname=req.getParameter("uname");
			String pass=req.getParameter("pass");
			resp.setHeader("Refresh", "5");
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			//resp.sendError(404, "Page Not Found");
			
			
			out.print("<html>");
			out.print("<body>");
			out.print(new Date().toString());
			
			out.print("<pre>");
			out.print("User Name : "+uname+"\n Password :"+pass);
			out.print("</pre>");
			out.print("</body>");
			out.print("</html>");
			
	
	}
	
}
