package com.maroti.servlet.hitscount;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HitsCount  extends HttpServlet{

	private int counts;
	String d;
	public void init(ServletConfig config) throws ServletException {
	
		counts=0;
		d=new Date().toString();
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		Date date = new Date();
		
		SimpleDateFormat simple = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss. S a zzz");
		String nDate=simple.format(date);
		resp.setHeader("Refresh", "2");
		counts++;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>"+"Started time   :"+ d +"</h1>");
		out.print("<h1>"+"Total Hits are :"+ counts +"</h1>");
		out.print("<h1>"+"Current time  : "+nDate+"</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}
	
}
