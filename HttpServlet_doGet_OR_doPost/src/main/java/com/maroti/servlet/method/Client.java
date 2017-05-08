package com.maroti.servlet.method;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Client extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String addr=req.getParameter("address");
		String mob=req.getParameter("mobile");
		String subjects=null;
		String[] subValues={};
		Enumeration<String> sub=req.getParameterNames();
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<table>");
		out.print("<tr>"+"<td>"+"Name"+"</td>"+"<td>"+name+"</td>"+"</tr>");
		out.print("<tr>"+"<td>"+"Address"+"</td>"+"<td>"+addr+"</td>"+"</tr>");
		out.print("<tr>"+"<td>"+"Mobile"+"</td>"+"<td>"+mob+"</td>"+"</tr>");
		out.print("<tr>"+"<td>"+"Subject"+"</td>");
		while(sub.hasMoreElements())
		{
			subjects=sub.nextElement();
			subValues=req.getParameterValues(subjects);
			
			
			for(int i=0; i<subValues.length; i++)
			{
				if(subValues[i].equals("Java"))
				out.println("<td>"+subValues[i]+"</td>");
				if(subValues[i].equals("Servlet"))
					out.println("<td>"+subValues[i]+"</td>");
				if(subValues[i].equals("Jsp"))
					out.println("<td>"+subValues[i]+"</td>");
			
			}

		}
		out.print("</tr>");
			
		out.print("</table>");
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String addr=req.getParameter("address");
		String mob=req.getParameter("mobile");
		String subjects=null;
		String[] subValues={};
		Enumeration<String> sub=req.getParameterNames();
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<table style='border:1px solid black'>");
		out.print("<tr>"+"<td>"+"Name"+"</td>"+"<td>"+name+"</td>"+"</tr>");
		out.print("<tr>"+"<td>"+"Address"+"</td>"+"<td>"+addr+"</td>"+"</tr>");
		out.print("<tr>"+"<td>"+"Mobile"+"</td>"+"<td>"+mob+"</td>"+"</tr>");
		out.print("<tr>"+"<td>"+"Subject"+"</td>");
		while(sub.hasMoreElements())
		{
			subjects=sub.nextElement();
			subValues=req.getParameterValues(subjects);
			
			
			for(int i=0; i<subValues.length; i++)
			{
				if(subValues[i].equals("Java"))
				out.println("<td>"+subValues[i]+"</td>");
				if(subValues[i].equals("Servlet"))
					out.println("<td>"+subValues[i]+"</td>");
				if(subValues[i].equals("Jsp"))
					out.println("<td>"+subValues[i]+"</td>");
			
			}

		}
		out.print("</tr>");
			
		out.print("</table>");
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
		
		
		

	}
}
